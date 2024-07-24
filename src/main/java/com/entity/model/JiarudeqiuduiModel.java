package com.entity.model;

import com.entity.JiarudeqiuduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 加入的球队
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiarudeqiuduiModel implements Serializable {
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
     * 球员
     */
    private Integer yonghuId;


    /**
     * 工资
     */
    private Double jiarudeqiuduiNumber;


    /**
     * 加入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：工资
	 */
    public Double getJiarudeqiuduiNumber() {
        return jiarudeqiuduiNumber;
    }


    /**
	 * 设置：工资
	 */
    public void setJiarudeqiuduiNumber(Double jiarudeqiuduiNumber) {
        this.jiarudeqiuduiNumber = jiarudeqiuduiNumber;
    }
    /**
	 * 获取：加入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：加入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
