package com.entity.view;

import com.entity.JiarudeqiuduiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 加入的球队
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiarudeqiudui")
public class JiarudeqiuduiView extends JiarudeqiuduiEntity implements Serializable {
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

		//级联表 yonghu
			/**
			* 球员姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiarudeqiuduiView() {

	}

	public JiarudeqiuduiView(JiarudeqiuduiEntity jiarudeqiuduiEntity) {
		try {
			BeanUtils.copyProperties(this, jiarudeqiuduiEntity);
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
















				//级联表的get和set yonghu

					/**
					* 获取： 球员姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 球员姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
