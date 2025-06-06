package com.entity.vo;

import com.entity.KaoshiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考试预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public class KaoshiyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面图
	 */
	
	private String fengmiantu;
		
	/**
	 * 考试场地
	 */
	
	private String kaoshichangdi;
		
	/**
	 * 考试日期
	 */
	
	private String kaoshiriqi;
		
	/**
	 * 考试场次
	 */
	
	private String kaoshichangci;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 驾校账号
	 */
	
	private String jiaxiaozhanghao;
		
	/**
	 * 驾校名称
	 */
	
	private String jiaxiaomingcheng;
		
	/**
	 * 学员账号
	 */
	
	private String xueyuanzhanghao;
		
	/**
	 * 学员姓名
	 */
	
	private String xueyuanxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 
	public void setKaoshiriqi(String kaoshiriqi) {
		this.kaoshiriqi = kaoshiriqi;
	}
	
	/**
	 * 获取：考试日期
	 */
	public String getKaoshiriqi() {
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
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
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
				
	
	/**
	 * 设置：学员账号
	 */
	 
	public void setXueyuanzhanghao(String xueyuanzhanghao) {
		this.xueyuanzhanghao = xueyuanzhanghao;
	}
	
	/**
	 * 获取：学员账号
	 */
	public String getXueyuanzhanghao() {
		return xueyuanzhanghao;
	}
				
	
	/**
	 * 设置：学员姓名
	 */
	 
	public void setXueyuanxingming(String xueyuanxingming) {
		this.xueyuanxingming = xueyuanxingming;
	}
	
	/**
	 * 获取：学员姓名
	 */
	public String getXueyuanxingming() {
		return xueyuanxingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
