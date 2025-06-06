package com.entity.model;

import com.entity.KaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 考试信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public class KaoshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
