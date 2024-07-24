package com.entity.model;

import com.entity.XunlianjinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 训练进度
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XunlianjinduModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 训练计划
     */
    private Integer xunlianjihuaId;


    /**
     * 球员
     */
    private Integer yonghuId;


    /**
     * 训练进度
     */
    private String xunlianjinduText;


    /**
     * 创建时间
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
	 * 获取：训练计划
	 */
    public Integer getXunlianjihuaId() {
        return xunlianjihuaId;
    }


    /**
	 * 设置：训练计划
	 */
    public void setXunlianjihuaId(Integer xunlianjihuaId) {
        this.xunlianjihuaId = xunlianjihuaId;
    }
    /**
	 * 获取：球员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：球员
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：训练进度
	 */
    public String getXunlianjinduText() {
        return xunlianjinduText;
    }


    /**
	 * 设置：训练进度
	 */
    public void setXunlianjinduText(String xunlianjinduText) {
        this.xunlianjinduText = xunlianjinduText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
