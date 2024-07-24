package com.entity.vo;

import com.entity.QiuduiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 球队信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiudui")
public class QiuduiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
