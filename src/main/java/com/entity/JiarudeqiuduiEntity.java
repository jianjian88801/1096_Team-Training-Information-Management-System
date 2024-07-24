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
 * 加入的球队
 *
 * @author 
 * @email
 */
@TableName("jiarudeqiudui")
public class JiarudeqiuduiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiarudeqiuduiEntity() {

	}

	public JiarudeqiuduiEntity(T t) {
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
     * 球员
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 工资
     */
    @TableField(value = "jiarudeqiudui_number")

    private Double jiarudeqiuduiNumber;


    /**
     * 加入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：工资
	 */
    public Double getJiarudeqiuduiNumber() {
        return jiarudeqiuduiNumber;
    }
    /**
	 * 获取：工资
	 */

    public void setJiarudeqiuduiNumber(Double jiarudeqiuduiNumber) {
        this.jiarudeqiuduiNumber = jiarudeqiuduiNumber;
    }
    /**
	 * 设置：加入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：加入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Jiarudeqiudui{" +
            "id=" + id +
            ", qiuduiId=" + qiuduiId +
            ", yonghuId=" + yonghuId +
            ", jiarudeqiuduiNumber=" + jiarudeqiuduiNumber +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
