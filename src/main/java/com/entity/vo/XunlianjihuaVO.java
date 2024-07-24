package com.entity.vo;

import com.entity.XunlianjihuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 训练计划
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xunlianjihua")
public class XunlianjihuaVO implements Serializable {
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

}
