package com.entity.model;

import com.entity.XunlianjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 训练计划
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XunlianjihuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 球队
     */
    private Integer qiuduiId;


    /**
     * 标题
     */
    private String xunlianjihuaName;


    /**
     * 训练天数
     */
    private String xunlianjihuaTianshu;


    /**
     * 训练内容
     */
    private String xunlianjihuaText;


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
	 * 获取：球队
	 */
    public Integer getQiuduiId() {
        return qiuduiId;
    }


    /**
	 * 设置：球队
	 */
    public void setQiuduiId(Integer qiuduiId) {
        this.qiuduiId = qiuduiId;
    }
    /**
	 * 获取：标题
	 */
    public String getXunlianjihuaName() {
        return xunlianjihuaName;
    }


    /**
	 * 设置：标题
	 */
    public void setXunlianjihuaName(String xunlianjihuaName) {
        this.xunlianjihuaName = xunlianjihuaName;
    }
    /**
	 * 获取：训练天数
	 */
    public String getXunlianjihuaTianshu() {
        return xunlianjihuaTianshu;
    }


    /**
	 * 设置：训练天数
	 */
    public void setXunlianjihuaTianshu(String xunlianjihuaTianshu) {
        this.xunlianjihuaTianshu = xunlianjihuaTianshu;
    }
    /**
	 * 获取：训练内容
	 */
    public String getXunlianjihuaText() {
        return xunlianjihuaText;
    }


    /**
	 * 设置：训练内容
	 */
    public void setXunlianjihuaText(String xunlianjihuaText) {
        this.xunlianjihuaText = xunlianjihuaText;
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
