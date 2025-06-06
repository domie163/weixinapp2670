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
 * 考试信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@TableName("kaoshixinxi")
public class KaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoshixinxiEntity() {
		
	}
	
	public KaoshixinxiEntity(T t) {
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
	 * 考试科目
	 */
					
	private String kaoshikemu;
	
	/**
	 * 封面图
	 */
					
	private String fengmiantu;
	
	/**
	 * 考试内容
	 */
					
	private String kaoshineirong;
	
	/**
	 * 考试场地
	 */
					
	private String kaoshichangdi;
	
	/**
	 * 考试日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaoshiriqi;
	
	/**
	 * 考试场次
	 */
					
	private String kaoshichangci;
	
	/**
	 * 截止时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiezhishijian;
	
	/**
	 * 驾校账号
	 */
					
	private String jiaxiaozhanghao;
	
	/**
	 * 驾校名称
	 */
					
	private String jiaxiaomingcheng;
	
	
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
	 * 设置：考试科目
	 */
	public void setKaoshikemu(String kaoshikemu) {
		this.kaoshikemu = kaoshikemu;
	}
	/**
	 * 获取：考试科目
	 */
	public String getKaoshikemu() {
		return kaoshikemu;
	}
	/**
	 * 设置：封面图
	 */
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
	}
	/**
	 * 设置：考试内容
	 */
	public void setKaoshineirong(String kaoshineirong) {
		this.kaoshineirong = kaoshineirong;
	}
	/**
	 * 获取：考试内容
	 */
	public String getKaoshineirong() {
		return kaoshineirong;
	}
	/**
	 * 设置：考试场地
	 */
	public void setKaoshichangdi(String kaoshichangdi) {
		this.kaoshichangdi = kaoshichangdi;
	}
	/**
	 * 获取：考试场地
	 */
	public String getKaoshichangdi() {
		return kaoshichangdi;
	}
	/**
	 * 设置：考试日期
	 */
	public void setKaoshiriqi(Date kaoshiriqi) {
		this.kaoshiriqi = kaoshiriqi;
	}
	/**
	 * 获取：考试日期
	 */
	public Date getKaoshiriqi() {
		return kaoshiriqi;
	}
	/**
	 * 设置：考试场次
	 */
	public void setKaoshichangci(String kaoshichangci) {
		this.kaoshichangci = kaoshichangci;
	}
	/**
	 * 获取：考试场次
	 */
	public String getKaoshichangci() {
		return kaoshichangci;
	}
	/**
	 * 设置：截止时间
	 */
	public void setJiezhishijian(Date jiezhishijian) {
		this.jiezhishijian = jiezhishijian;
	}
	/**
	 * 获取：截止时间
	 */
	public Date getJiezhishijian() {
		return jiezhishijian;
	}
	/**
	 * 设置：驾校账号
	 */
	public void setJiaxiaozhanghao(String jiaxiaozhanghao) {
		this.jiaxiaozhanghao = jiaxiaozhanghao;
	}
	/**
	 * 获取：驾校账号
	 */
	public String getJiaxiaozhanghao() {
		return jiaxiaozhanghao;
	}
	/**
	 * 设置：驾校名称
	 */
	public void setJiaxiaomingcheng(String jiaxiaomingcheng) {
		this.jiaxiaomingcheng = jiaxiaomingcheng;
	}
	/**
	 * 获取：驾校名称
	 */
	public String getJiaxiaomingcheng() {
		return jiaxiaomingcheng;
	}

}
