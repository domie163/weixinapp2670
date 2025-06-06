package com.entity.view;

import com.entity.XueyuanbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学员报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
@TableName("xueyuanbaoming")
public class XueyuanbaomingView  extends XueyuanbaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueyuanbaomingView(){
	}
 
 	public XueyuanbaomingView(XueyuanbaomingEntity xueyuanbaomingEntity){
 	try {
			BeanUtils.copyProperties(this, xueyuanbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
