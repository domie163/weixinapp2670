package com.dao;

import com.entity.JiaxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaxiaoVO;
import com.entity.view.JiaxiaoView;


/**
 * 驾校
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface JiaxiaoDao extends BaseMapper<JiaxiaoEntity> {
	
	List<JiaxiaoVO> selectListVO(@Param("ew") Wrapper<JiaxiaoEntity> wrapper);
	
	JiaxiaoVO selectVO(@Param("ew") Wrapper<JiaxiaoEntity> wrapper);
	
	List<JiaxiaoView> selectListView(@Param("ew") Wrapper<JiaxiaoEntity> wrapper);

	List<JiaxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiaxiaoEntity> wrapper);
	
	JiaxiaoView selectView(@Param("ew") Wrapper<JiaxiaoEntity> wrapper);
	
}
