package com.dao;

import com.entity.JiazhaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhaoleixingVO;
import com.entity.view.JiazhaoleixingView;


/**
 * 驾照类型
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface JiazhaoleixingDao extends BaseMapper<JiazhaoleixingEntity> {
	
	List<JiazhaoleixingVO> selectListVO(@Param("ew") Wrapper<JiazhaoleixingEntity> wrapper);
	
	JiazhaoleixingVO selectVO(@Param("ew") Wrapper<JiazhaoleixingEntity> wrapper);
	
	List<JiazhaoleixingView> selectListView(@Param("ew") Wrapper<JiazhaoleixingEntity> wrapper);

	List<JiazhaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhaoleixingEntity> wrapper);
	
	JiazhaoleixingView selectView(@Param("ew") Wrapper<JiazhaoleixingEntity> wrapper);
	
}
