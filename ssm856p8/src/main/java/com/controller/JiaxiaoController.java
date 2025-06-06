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

import com.entity.JiaxiaoEntity;
import com.entity.view.JiaxiaoView;

import com.service.JiaxiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 驾校
 * 后端接口
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@RestController
@RequestMapping("/jiaxiao")
public class JiaxiaoController {
    @Autowired
    private JiaxiaoService jiaxiaoService;


    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		JiaxiaoEntity user = jiaxiaoService.selectOne(new EntityWrapper<JiaxiaoEntity>().eq("jiaxiaozhanghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(user.getId(), username,"jiaxiao",  "驾校" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody JiaxiaoEntity jiaxiao){
    	//ValidatorUtils.validateEntity(jiaxiao);
    	JiaxiaoEntity user = jiaxiaoService.selectOne(new EntityWrapper<JiaxiaoEntity>().eq("jiaxiaozhanghao", jiaxiao.getJiaxiaozhanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		jiaxiao.setId(uId);
        jiaxiaoService.insert(jiaxiao);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        JiaxiaoEntity user = jiaxiaoService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	JiaxiaoEntity user = jiaxiaoService.selectOne(new EntityWrapper<JiaxiaoEntity>().eq("jiaxiaozhanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
    	user.setMima("123456");
        jiaxiaoService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaxiaoEntity jiaxiao, 
		HttpServletRequest request){

        EntityWrapper<JiaxiaoEntity> ew = new EntityWrapper<JiaxiaoEntity>();
		PageUtils page = jiaxiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaxiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaxiaoEntity jiaxiao, 
		HttpServletRequest request){
        EntityWrapper<JiaxiaoEntity> ew = new EntityWrapper<JiaxiaoEntity>();
		PageUtils page = jiaxiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaxiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaxiaoEntity jiaxiao){
       	EntityWrapper<JiaxiaoEntity> ew = new EntityWrapper<JiaxiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaxiao, "jiaxiao")); 
        return R.ok().put("data", jiaxiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaxiaoEntity jiaxiao){
        EntityWrapper< JiaxiaoEntity> ew = new EntityWrapper< JiaxiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaxiao, "jiaxiao")); 
		JiaxiaoView jiaxiaoView =  jiaxiaoService.selectView(ew);
		return R.ok("查询驾校成功").put("data", jiaxiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaxiaoEntity jiaxiao = jiaxiaoService.selectById(id);
        return R.ok().put("data", jiaxiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaxiaoEntity jiaxiao = jiaxiaoService.selectById(id);
        return R.ok().put("data", jiaxiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaxiaoEntity jiaxiao, HttpServletRequest request){
    	jiaxiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaxiao);
    	JiaxiaoEntity user = jiaxiaoService.selectOne(new EntityWrapper<JiaxiaoEntity>().eq("jiaxiaozhanghao", jiaxiao.getJiaxiaozhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		jiaxiao.setId(new Date().getTime());
        jiaxiaoService.insert(jiaxiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaxiaoEntity jiaxiao, HttpServletRequest request){
    	jiaxiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaxiao);
    	JiaxiaoEntity user = jiaxiaoService.selectOne(new EntityWrapper<JiaxiaoEntity>().eq("jiaxiaozhanghao", jiaxiao.getJiaxiaozhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		jiaxiao.setId(new Date().getTime());
        jiaxiaoService.insert(jiaxiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaxiaoEntity jiaxiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaxiao);
        jiaxiaoService.updateById(jiaxiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaxiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiaxiaoEntity> wrapper = new EntityWrapper<JiaxiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiaxiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






}
