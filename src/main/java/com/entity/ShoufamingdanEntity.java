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
 * 比赛首发名单
 *
 * @author 
 * @email
 */
@TableName("shoufamingdan")
public class ShoufamingdanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShoufamingdanEntity() {

	}

	public ShoufamingdanEntity(T t) {
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
     * 名单下载
     */
    @TableField(value = "shoufamingdan_file")

    private String shoufamingdanFile;


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
	 * 设置：名单下载
	 */
    public String getShoufamingdanFile() {
        return shoufamingdanFile;
    }
    /**
	 * 获取：名单下载
	 */

    public void setShoufamingdanFile(String shoufamingdanFile) {
        this.shoufamingdanFile = shoufamingdanFile;
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
        return "Shoufamingdan{" +
            "id=" + id +
            ", qiuduiId=" + qiuduiId +
            ", shoufamingdanFile=" + shoufamingdanFile +
            ", createTime=" + createTime +
        "}";
    }
}
