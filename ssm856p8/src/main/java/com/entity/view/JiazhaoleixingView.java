package com.entity.view;

import com.entity.JiazhaoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾照类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@TableName("jiazhaoleixing")
public class JiazhaoleixingView  extends JiazhaoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhaoleixingView(){
	}
 
 	public JiazhaoleixingView(JiazhaoleixingEntity jiazhaoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhaoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
