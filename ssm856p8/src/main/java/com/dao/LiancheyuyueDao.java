package com.dao;

import com.entity.LiancheyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiancheyuyueVO;
import com.entity.view.LiancheyuyueView;


/**
 * 练车预约
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface LiancheyuyueDao extends BaseMapper<LiancheyuyueEntity> {
	
	List<LiancheyuyueVO> selectListVO(@Param("ew") Wrapper<LiancheyuyueEntity> wrapper);
	
	LiancheyuyueVO selectVO(@Param("ew") Wrapper<LiancheyuyueEntity> wrapper);
	
	List<LiancheyuyueView> selectListView(@Param("ew") Wrapper<LiancheyuyueEntity> wrapper);

	List<LiancheyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<LiancheyuyueEntity> wrapper);
	
	LiancheyuyueView selectView(@Param("ew") Wrapper<LiancheyuyueEntity> wrapper);
	
}
