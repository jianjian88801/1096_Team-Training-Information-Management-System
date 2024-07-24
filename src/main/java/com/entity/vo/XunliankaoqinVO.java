package com.entity.vo;

import com.entity.XunliankaoqinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考勤信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xunliankaoqin")
public class XunliankaoqinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 打卡时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：打卡时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：打卡时间
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

}
