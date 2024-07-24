package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 训练进度
 *
 * @author 
 * @email
 */
@TableName("xunlianjindu")
public class XunlianjinduEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XunlianjinduEntity() {

	}

	public XunlianjinduEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 训练计划
     */
    @TableField(value = "xunlianjihua_id")

    private Integer xunlianjihuaId;


    /**
     * 球员
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 训练进度
     */
    @TableField(value = "xunlianjindu_text")

    private String xunlianjinduText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：训练计划
	 */
    public Integer getXunlianjihuaId() {
        return xunlianjihuaId;
    }
    /**
	 * 获取：训练计划
	 */

    public void setXunlianjihuaId(Integer xunlianjihuaId) {
        this.xunlianjihuaId = xunlianjihuaId;
    }
    /**
	 * 设置：球员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：球员
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：训练进度
	 */
    public String getXunlianjinduText() {
        return xunlianjinduText;
    }
    /**
	 * 获取：训练进度
	 */

    public void setXunlianjinduText(String xunlianjinduText) {
        this.xunlianjinduText = xunlianjinduText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xunlianjindu{" +
            "id=" + id +
            ", xunlianjihuaId=" + xunlianjihuaId +
            ", yonghuId=" + yonghuId +
            ", xunlianjinduText=" + xunlianjinduText +
            ", createTime=" + createTime +
        "}";
    }
}
