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

import com.entity.JiakaowenzhangEntity;
import com.entity.view.JiakaowenzhangView;

import com.service.JiakaowenzhangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 驾考文章
 * 后端接口
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@RestController
@RequestMapping("/jiakaowenzhang")
public class JiakaowenzhangController {
    @Autowired
    private JiakaowenzhangService jiakaowenzhangService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiakaowenzhangEntity jiakaowenzhang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaxiao")) {
			jiakaowenzhang.setJiaxiaozhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiakaowenzhangEntity> ew = new EntityWrapper<JiakaowenzhangEntity>();
		PageUtils page = jiakaowenzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiakaowenzhang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiakaowenzhangEntity jiakaowenzhang, 
		HttpServletRequest request){
        EntityWrapper<JiakaowenzhangEntity> ew = new EntityWrapper<JiakaowenzhangEntity>();
		PageUtils page = jiakaowenzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiakaowenzhang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiakaowenzhangEntity jiakaowenzhang){
       	EntityWrapper<JiakaowenzhangEntity> ew = new EntityWrapper<JiakaowenzhangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiakaowenzhang, "jiakaowenzhang")); 
        return R.ok().put("data", jiakaowenzhangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiakaowenzhangEntity jiakaowenzhang){
        EntityWrapper< JiakaowenzhangEntity> ew = new EntityWrapper< JiakaowenzhangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiakaowenzhang, "jiakaowenzhang")); 
		JiakaowenzhangView jiakaowenzhangView =  jiakaowenzhangService.selectView(ew);
		return R.ok("查询驾考文章成功").put("data", jiakaowenzhangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiakaowenzhangEntity jiakaowenzhang = jiakaowenzhangService.selectById(id);
        return R.ok().put("data", jiakaowenzhang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiakaowenzhangEntity jiakaowenzhang = jiakaowenzhangService.selectById(id);
        return R.ok().put("data", jiakaowenzhang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiakaowenzhangEntity jiakaowenzhang, HttpServletRequest request){
    	jiakaowenzhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiakaowenzhang);

        jiakaowenzhangService.insert(jiakaowenzhang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiakaowenzhangEntity jiakaowenzhang, HttpServletRequest request){
    	jiakaowenzhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiakaowenzhang);

        jiakaowenzhangService.insert(jiakaowenzhang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiakaowenzhangEntity jiakaowenzhang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiakaowenzhang);
        jiakaowenzhangService.updateById(jiakaowenzhang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiakaowenzhangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiakaowenzhangEntity> wrapper = new EntityWrapper<JiakaowenzhangEntity>();
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

		int count = jiakaowenzhangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






}
