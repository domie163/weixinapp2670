package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XueyuanbaomingEntity;
import com.entity.view.XueyuanbaomingView;

import com.service.XueyuanbaomingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 学员报名
 * 后端接口
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@RestController
@RequestMapping("/xueyuanbaoming")
public class XueyuanbaomingController {
    @Autowired
    private XueyuanbaomingService xueyuanbaomingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueyuanbaomingEntity xueyuanbaoming, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaxiao")) {
			xueyuanbaoming.setJiaxiaozhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xueyuan")) {
			xueyuanbaoming.setXueyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueyuanbaomingEntity> ew = new EntityWrapper<XueyuanbaomingEntity>();
		PageUtils page = xueyuanbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueyuanbaoming), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueyuanbaomingEntity xueyuanbaoming, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaxiao")) {
			xueyuanbaoming.setJiaxiaozhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xueyuan")) {
			xueyuanbaoming.setXueyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueyuanbaomingEntity> ew = new EntityWrapper<XueyuanbaomingEntity>();
		PageUtils page = xueyuanbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueyuanbaoming), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueyuanbaomingEntity xueyuanbaoming){
       	EntityWrapper<XueyuanbaomingEntity> ew = new EntityWrapper<XueyuanbaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueyuanbaoming, "xueyuanbaoming")); 
        return R.ok().put("data", xueyuanbaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueyuanbaomingEntity xueyuanbaoming){
        EntityWrapper< XueyuanbaomingEntity> ew = new EntityWrapper< XueyuanbaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueyuanbaoming, "xueyuanbaoming")); 
		XueyuanbaomingView xueyuanbaomingView =  xueyuanbaomingService.selectView(ew);
		return R.ok("查询学员报名成功").put("data", xueyuanbaomingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueyuanbaomingEntity xueyuanbaoming = xueyuanbaomingService.selectById(id);
        return R.ok().put("data", xueyuanbaoming);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueyuanbaomingEntity xueyuanbaoming = xueyuanbaomingService.selectById(id);
        return R.ok().put("data", xueyuanbaoming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueyuanbaomingEntity xueyuanbaoming, HttpServletRequest request){
    	xueyuanbaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueyuanbaoming);

        xueyuanbaomingService.insert(xueyuanbaoming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueyuanbaomingEntity xueyuanbaoming, HttpServletRequest request){
    	xueyuanbaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueyuanbaoming);
    	xueyuanbaoming.setUserid((Long)request.getSession().getAttribute("userId"));

        xueyuanbaomingService.insert(xueyuanbaoming);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueyuanbaomingEntity xueyuanbaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueyuanbaoming);
        xueyuanbaomingService.updateById(xueyuanbaoming);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueyuanbaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XueyuanbaomingEntity> wrapper = new EntityWrapper<XueyuanbaomingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaxiao")) {
			wrapper.eq("jiaxiaozhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xueyuan")) {
			wrapper.eq("xueyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueyuanbaomingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






}
