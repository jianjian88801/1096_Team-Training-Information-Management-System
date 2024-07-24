package com.entity.view;

import com.entity.XunlianjinduEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 训练进度
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xunlianjindu")
public class XunlianjinduView extends XunlianjinduEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xunlianjihua
			/**
			* 标题
			*/
			private String xunlianjihuaName;
			/**
			* 训练天数
			*/
			private String xunlianjihuaTianshu;
			/**
			* 训练内容
			*/
			private String xunlianjihuaText;

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

	public XunlianjinduView() {

	}

	public XunlianjinduView(XunlianjinduEntity xunlianjinduEntity) {
		try {
			BeanUtils.copyProperties(this, xunlianjinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set xunlianjihua


					/**
					* 获取： 标题
					*/
					public String getXunlianjihuaName() {
						return xunlianjihuaName;
					}
					/**
					* 设置： 标题
					*/
					public void setXunlianjihuaName(String xunlianjihuaName) {
						this.xunlianjihuaName = xunlianjihuaName;
					}

					/**
					* 获取： 训练天数
					*/
					public String getXunlianjihuaTianshu() {
						return xunlianjihuaTianshu;
					}
					/**
					* 设置： 训练天数
					*/
					public void setXunlianjihuaTianshu(String xunlianjihuaTianshu) {
						this.xunlianjihuaTianshu = xunlianjihuaTianshu;
					}

					/**
					* 获取： 训练内容
					*/
					public String getXunlianjihuaText() {
						return xunlianjihuaText;
					}
					/**
					* 设置： 训练内容
					*/
					public void setXunlianjihuaText(String xunlianjihuaText) {
						this.xunlianjihuaText = xunlianjihuaText;
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
