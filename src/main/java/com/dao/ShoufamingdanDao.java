package com.dao;

import com.entity.ShoufamingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoufamingdanView;

/**
 * 比赛首发名单 Dao 接口
 *
 * @author 
 */
public interface ShoufamingdanDao extends BaseMapper<ShoufamingdanEntity> {

   List<ShoufamingdanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
