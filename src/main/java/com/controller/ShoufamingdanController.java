
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 比赛首发名单
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shoufamingdan")
public class ShoufamingdanController {
    private static final Logger logger = LoggerFactory.getLogger(ShoufamingdanController.class);

    @Autowired
    private ShoufamingdanService shoufamingdanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private QiuduiService qiuduiService;
    @Autowired
    private JiarudeqiuduiService jiarudeqiuduiService;

    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private JiaolianService jiaolianService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("球员".equals(role)){
            Wrapper<JiarudeqiuduiEntity> queryWrapper = new EntityWrapper<JiarudeqiuduiEntity>()
                    .eq("yonghu_id",request.getSession().getAttribute("userId"));
            params.put("qiuduiId",jiarudeqiuduiService.selectList(queryWrapper).get(0).getQiuduiId());
        }
        else if("教练".equals(role))
            params.put("jiaolianId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shoufamingdanService.queryPage(params);

        //字典表数据转换
        List<ShoufamingdanView> list =(List<ShoufamingdanView>)page.getList();
        for(ShoufamingdanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShoufamingdanEntity shoufamingdan = shoufamingdanService.selectById(id);
        if(shoufamingdan !=null){
            //entity转view
            ShoufamingdanView view = new ShoufamingdanView();
            BeanUtils.copyProperties( shoufamingdan , view );//把实体数据重构到view中

                //级联表
                QiuduiEntity qiudui = qiuduiService.selectById(shoufamingdan.getQiuduiId());
                if(qiudui != null){
                    BeanUtils.copyProperties( qiudui , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setQiuduiId(qiudui.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShoufamingdanEntity shoufamingdan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shoufamingdan:{}",this.getClass().getName(),shoufamingdan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ShoufamingdanEntity> queryWrapper = new EntityWrapper<ShoufamingdanEntity>()
            .eq("qiudui_id", shoufamingdan.getQiuduiId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoufamingdanEntity shoufamingdanEntity = shoufamingdanService.selectOne(queryWrapper);
        if(shoufamingdanEntity==null){
            shoufamingdan.setCreateTime(new Date());
            shoufamingdanService.insert(shoufamingdan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShoufamingdanEntity shoufamingdan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shoufamingdan:{}",this.getClass().getName(),shoufamingdan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ShoufamingdanEntity> queryWrapper = new EntityWrapper<ShoufamingdanEntity>()
            .notIn("id",shoufamingdan.getId())
            .andNew()
            .eq("qiudui_id", shoufamingdan.getQiuduiId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoufamingdanEntity shoufamingdanEntity = shoufamingdanService.selectOne(queryWrapper);
        if("".equals(shoufamingdan.getShoufamingdanFile()) || "null".equals(shoufamingdan.getShoufamingdanFile())){
                shoufamingdan.setShoufamingdanFile(null);
        }
        if(shoufamingdanEntity==null){
            shoufamingdanService.updateById(shoufamingdan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shoufamingdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ShoufamingdanEntity> shoufamingdanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShoufamingdanEntity shoufamingdanEntity = new ShoufamingdanEntity();
//                            shoufamingdanEntity.setQiuduiId(Integer.valueOf(data.get(0)));   //球队 要改的
//                            shoufamingdanEntity.setShoufamingdanFile(data.get(0));                    //名单下载 要改的
//                            shoufamingdanEntity.setCreateTime(date);//时间
                            shoufamingdanList.add(shoufamingdanEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        shoufamingdanService.insertBatch(shoufamingdanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
