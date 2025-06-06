package com.dao;

import com.entity.XueyuanbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuanbaomingVO;
import com.entity.view.XueyuanbaomingView;


/**
 * 学员报名
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface XueyuanbaomingDao extends BaseMapper<XueyuanbaomingEntity> {
	
	List<XueyuanbaomingVO> selectListVO(@Param("ew") Wrapper<XueyuanbaomingEntity> wrapper);
	
	XueyuanbaomingVO selectVO(@Param("ew") Wrapper<XueyuanbaomingEntity> wrapper);
	
	List<XueyuanbaomingView> selectListView(@Param("ew") Wrapper<XueyuanbaomingEntity> wrapper);

	List<XueyuanbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuanbaomingEntity> wrapper);
	
	XueyuanbaomingView selectView(@Param("ew") Wrapper<XueyuanbaomingEntity> wrapper);
	
}
