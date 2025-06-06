package com.entity.model;

import com.entity.BaomingrukouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 报名入口
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public class BaomingrukouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 驾校名称
	 */
	
	private String jiaxiaomingcheng;
		
	/**
	 * 驾校地址
	 */
	
	private String jiaxiaodizhi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 驾照类型
	 */
	
	private String jiazhaoleixing;
		
	/**
	 * 学车费用
	 */
	
	private Integer xuechefeiyong;
		
	/**
	 * 费用说明
	 */
	
	private String feiyongshuoming;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：驾校地址
	 */
	 
	public void setJiaxiaodizhi(String jiaxiaodizhi) {
		this.jiaxiaodizhi = jiaxiaodizhi;
	}
	
	/**
	 * 获取：驾校地址
	 */
	public String getJiaxiaodizhi() {
		return jiaxiaodizhi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：驾照类型
	 */
	 
	public void setJiazhaoleixing(String jiazhaoleixing) {
		this.jiazhaoleixing = jiazhaoleixing;
	}
	
	/**
	 * 获取：驾照类型
	 */
	public String getJiazhaoleixing() {
		return jiazhaoleixing;
	}
				
	
	/**
	 * 设置：学车费用
	 */
	 
	public void setXuechefeiyong(Integer xuechefeiyong) {
		this.xuechefeiyong = xuechefeiyong;
	}
	
	/**
	 * 获取：学车费用
	 */
	public Integer getXuechefeiyong() {
		return xuechefeiyong;
	}
				
	
	/**
	 * 设置：费用说明
	 */
	 
	public void setFeiyongshuoming(String feiyongshuoming) {
		this.feiyongshuoming = feiyongshuoming;
	}
	
	/**
	 * 获取：费用说明
	 */
	public String getFeiyongshuoming() {
		return feiyongshuoming;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
