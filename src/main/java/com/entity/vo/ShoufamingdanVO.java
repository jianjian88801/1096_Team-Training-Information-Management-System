package com.entity.vo;

import com.entity.ShoufamingdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 比赛首发名单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shoufamingdan")
public class ShoufamingdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
