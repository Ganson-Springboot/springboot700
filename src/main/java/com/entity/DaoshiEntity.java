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
 * 导师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 18:24:13
 */
@TableName("daoshi")
public class DaoshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DaoshiEntity() {
		
	}
	
	public DaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 导师账号
	 */
					
	private String daoshizhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 导师姓名
	 */
					
	private String daoshixingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 导师电话
	 */
					
	private String daoshidianhua;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：导师账号
	 */
	public void setDaoshizhanghao(String daoshizhanghao) {
		this.daoshizhanghao = daoshizhanghao;
	}
	/**
	 * 获取：导师账号
	 */
	public String getDaoshizhanghao() {
		return daoshizhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：导师姓名
	 */
	public void setDaoshixingming(String daoshixingming) {
		this.daoshixingming = daoshixingming;
	}
	/**
	 * 获取：导师姓名
	 */
	public String getDaoshixingming() {
		return daoshixingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：导师电话
	 */
	public void setDaoshidianhua(String daoshidianhua) {
		this.daoshidianhua = daoshidianhua;
	}
	/**
	 * 获取：导师电话
	 */
	public String getDaoshidianhua() {
		return daoshidianhua;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}

}
