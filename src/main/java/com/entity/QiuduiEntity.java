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
 * 球队信息
 *
 * @author 
 * @email
 */
@TableName("qiudui")
public class QiuduiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiuduiEntity() {

	}

	public QiuduiEntity(T t) {
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
     * 球队名称
     */
    @TableField(value = "qiudui_name")

    private String qiuduiName;


    /**
     * 球队类型
     */
    @TableField(value = "qiudui_types")

    private Integer qiuduiTypes;


    /**
     * 所属地点
     */
    @TableField(value = "qiudui_address")

    private String qiuduiAddress;


    /**
     * 教练
     */
    @TableField(value = "jiaolian_id")

    private Integer jiaolianId;


    /**
     * 球队简介
     */
    @TableField(value = "qiudui_content")

    private String qiuduiContent;


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
	 * 设置：球队名称
	 */
    public String getQiuduiName() {
        return qiuduiName;
    }
    /**
	 * 获取：球队名称
	 */

    public void setQiuduiName(String qiuduiName) {
        this.qiuduiName = qiuduiName;
    }
    /**
	 * 设置：球队类型
	 */
    public Integer getQiuduiTypes() {
        return qiuduiTypes;
    }
    /**
	 * 获取：球队类型
	 */

    public void setQiuduiTypes(Integer qiuduiTypes) {
        this.qiuduiTypes = qiuduiTypes;
    }
    /**
	 * 设置：所属地点
	 */
    public String getQiuduiAddress() {
        return qiuduiAddress;
    }
    /**
	 * 获取：所属地点
	 */

    public void setQiuduiAddress(String qiuduiAddress) {
        this.qiuduiAddress = qiuduiAddress;
    }
    /**
	 * 设置：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }
    /**
	 * 获取：教练
	 */

    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 设置：球队简介
	 */
    public String getQiuduiContent() {
        return qiuduiContent;
    }
    /**
	 * 获取：球队简介
	 */

    public void setQiuduiContent(String qiuduiContent) {
        this.qiuduiContent = qiuduiContent;
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
        return "Qiudui{" +
            "id=" + id +
            ", qiuduiName=" + qiuduiName +
            ", qiuduiTypes=" + qiuduiTypes +
            ", qiuduiAddress=" + qiuduiAddress +
            ", jiaolianId=" + jiaolianId +
            ", qiuduiContent=" + qiuduiContent +
            ", createTime=" + createTime +
        "}";
    }
}
