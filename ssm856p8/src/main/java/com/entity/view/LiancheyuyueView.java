package com.entity.view;

import com.entity.LiancheyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 练车预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@TableName("liancheyuyue")
public class LiancheyuyueView  extends LiancheyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiancheyuyueView(){
	}
 
 	public LiancheyuyueView(LiancheyuyueEntity liancheyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, liancheyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
