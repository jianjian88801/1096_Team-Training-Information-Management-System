package com.entity.view;

import com.entity.ShoufamingdanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 比赛首发名单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shoufamingdan")
public class ShoufamingdanView extends ShoufamingdanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 qiudui
			/**
			* 球队名称
			*/
			private String qiuduiName;
			/**
			* 球队类型
			*/
			private Integer qiuduiTypes;
				/**
				* 球队类型的值
				*/
				private String qiuduiValue;
			/**
			* 所属地点
			*/
			private String qiuduiAddress;
			/**
			* 球队信息 的 教练
			*/
			private Integer qiuduiJiaolianId;
			/**
			* 球队简介
			*/
			private String qiuduiContent;

	public ShoufamingdanView() {

	}

	public ShoufamingdanView(ShoufamingdanEntity shoufamingdanEntity) {
		try {
			BeanUtils.copyProperties(this, shoufamingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















				//级联表的get和set qiudui

					/**
					* 获取： 球队名称
					*/
					public String getQiuduiName() {
						return qiuduiName;
					}
					/**
					* 设置： 球队名称
					*/
					public void setQiuduiName(String qiuduiName) {
						this.qiuduiName = qiuduiName;
					}

					/**
					* 获取： 球队类型
					*/
					public Integer getQiuduiTypes() {
						return qiuduiTypes;
					}
					/**
					* 设置： 球队类型
					*/
					public void setQiuduiTypes(Integer qiuduiTypes) {
						this.qiuduiTypes = qiuduiTypes;
					}


						/**
						* 获取： 球队类型的值
						*/
						public String getQiuduiValue() {
							return qiuduiValue;
						}
						/**
						* 设置： 球队类型的值
						*/
						public void setQiuduiValue(String qiuduiValue) {
							this.qiuduiValue = qiuduiValue;
						}

					/**
					* 获取： 所属地点
					*/
					public String getQiuduiAddress() {
						return qiuduiAddress;
					}
					/**
					* 设置： 所属地点
					*/
					public void setQiuduiAddress(String qiuduiAddress) {
						this.qiuduiAddress = qiuduiAddress;
					}

					/**
					* 获取：球队信息 的 教练
					*/
					public Integer getQiuduiJiaolianId() {
						return qiuduiJiaolianId;
					}
					/**
					* 设置：球队信息 的 教练
					*/
					public void setQiuduiJiaolianId(Integer qiuduiJiaolianId) {
						this.qiuduiJiaolianId = qiuduiJiaolianId;
					}


					/**
					* 获取： 球队简介
					*/
					public String getQiuduiContent() {
						return qiuduiContent;
					}
					/**
					* 设置： 球队简介
					*/
					public void setQiuduiContent(String qiuduiContent) {
						this.qiuduiContent = qiuduiContent;
					}












}
