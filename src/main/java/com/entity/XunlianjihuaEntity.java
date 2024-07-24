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
 * 训练计划
 *
 * @author 
 * @email
 */
@TableName("xunlianjihua")
public class XunlianjihuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XunlianjihuaEntity() {

	}

	public XunlianjihuaEntity(T t) {
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
     * 球队
     */
    @TableField(value = "qiudui_id")

    private Integer qiuduiId;


    /**
     * 标题
     */
    @TableField(value = "xunlianjihua_name")

    private String xunlianjihuaName;


    /**
     * 训练天数
     */
    @TableField(value = "xunlianjihua_tianshu")

    private String xunlianjihuaTianshu;


    /**
     * 训练内容
     */
    @TableField(value = "xunlianjihua_text")

    private String xunlianjihuaText;


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
	 * 设置：球队
	 */
    public Integer getQiuduiId() {
        return qiuduiId;
    }
    /**
	 * 获取：球队
	 */

    public void setQiuduiId(Integer qiuduiId) {
        this.qiuduiId = qiuduiId;
    }
    /**
	 * 设置：标题
	 */
    public String getXunlianjihuaName() {
        return xunlianjihuaName;
    }
    /**
	 * 获取：标题
	 */

    public void setXunlianjihuaName(String xunlianjihuaName) {
        this.xunlianjihuaName = xunlianjihuaName;
    }
    /**
	 * 设置：训练天数
	 */
    public String getXunlianjihuaTianshu() {
        return xunlianjihuaTianshu;
    }
    /**
	 * 获取：训练天数
	 */

    public void setXunlianjihuaTianshu(String xunlianjihuaTianshu) {
        this.xunlianjihuaTianshu = xunlianjihuaTianshu;
    }
    /**
	 * 设置：训练内容
	 */
    public String getXunlianjihuaText() {
        return xunlianjihuaText;
    }
    /**
	 * 获取：训练内容
	 */

    public void setXunlianjihuaText(String xunlianjihuaText) {
        this.xunlianjihuaText = xunlianjihuaText;
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
        return "Xunlianjihua{" +
            "id=" + id +
            ", qiuduiId=" + qiuduiId +
            ", xunlianjihuaName=" + xunlianjihuaName +
            ", xunlianjihuaTianshu=" + xunlianjihuaTianshu +
            ", xunlianjihuaText=" + xunlianjihuaText +
            ", createTime=" + createTime +
        "}";
    }
}
