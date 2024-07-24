package com.entity.model;

import com.entity.QiuduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 球队信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiuduiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 球队名称
     */
    private String qiuduiName;


    /**
     * 球队类型
     */
    private Integer qiuduiTypes;


    /**
     * 所属地点
     */
    private String qiuduiAddress;


    /**
     * 教练
     */
    private Integer jiaolianId;


    /**
     * 球队简介
     */
    private String qiuduiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：球队名称
	 */
    public String getQiuduiName() {
        return qiuduiName;
    }


    /**
	 * 设置：球队名称
	 */
    public void setQiuduiName(String qiuduiName) {
        this.qiuduiName = qiuduiName;
    }
    /**
	 * 获取：球队类型
	 */
    public Integer getQiuduiTypes() {
        return qiuduiTypes;
    }


    /**
	 * 设置：球队类型
	 */
    public void setQiuduiTypes(Integer qiuduiTypes) {
        this.qiuduiTypes = qiuduiTypes;
    }
    /**
	 * 获取：所属地点
	 */
    public String getQiuduiAddress() {
        return qiuduiAddress;
    }


    /**
	 * 设置：所属地点
	 */
    public void setQiuduiAddress(String qiuduiAddress) {
        this.qiuduiAddress = qiuduiAddress;
    }
    /**
	 * 获取：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 设置：教练
	 */
    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 获取：球队简介
	 */
    public String getQiuduiContent() {
        return qiuduiContent;
    }


    /**
	 * 设置：球队简介
	 */
    public void setQiuduiContent(String qiuduiContent) {
        this.qiuduiContent = qiuduiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
