package com.entity.view;

import com.entity.DiscusskaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-13 20:05:00
 */
@TableName("discusskaoshixinxi")
public class DiscusskaoshixinxiView  extends DiscusskaoshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskaoshixinxiView(){
	}
 
 	public DiscusskaoshixinxiView(DiscusskaoshixinxiEntity discusskaoshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusskaoshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
