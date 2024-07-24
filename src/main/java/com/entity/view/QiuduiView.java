package com.entity.view;

import com.entity.QiuduiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 球队信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qiudui")
public class QiuduiView extends QiuduiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 球队类型的值
		*/
		private String qiuduiValue;



		//级联表 jiaolian
			/**
			* 教练姓名
			*/
			private String jiaolianName;
			/**
			* 手机号
			*/
			private String jiaolianPhone;
			/**
			* 电子邮箱
			*/
			private String jiaolianEmail;
			/**
			* 假删
			*/
			private Integer jiaolianDelete;

	public QiuduiView() {

	}

	public QiuduiView(QiuduiEntity qiuduiEntity) {
		try {
			BeanUtils.copyProperties(this, qiuduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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






				//级联表的get和set jiaolian

					/**
					* 获取： 教练姓名
					*/
					public String getJiaolianName() {
						return jiaolianName;
					}
					/**
					* 设置： 教练姓名
					*/
					public void setJiaolianName(String jiaolianName) {
						this.jiaolianName = jiaolianName;
					}

					/**
					* 获取： 手机号
					*/
					public String getJiaolianPhone() {
						return jiaolianPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setJiaolianPhone(String jiaolianPhone) {
						this.jiaolianPhone = jiaolianPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getJiaolianEmail() {
						return jiaolianEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setJiaolianEmail(String jiaolianEmail) {
						this.jiaolianEmail = jiaolianEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getJiaolianDelete() {
						return jiaolianDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setJiaolianDelete(Integer jiaolianDelete) {
						this.jiaolianDelete = jiaolianDelete;
					}


















}
