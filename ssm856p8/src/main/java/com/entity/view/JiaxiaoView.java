package com.entity.view;

import com.entity.JiaxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾校
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@TableName("jiaxiao")
public class JiaxiaoView  extends JiaxiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaxiaoView(){
	}
 
 	public JiaxiaoView(JiaxiaoEntity jiaxiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiaxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
