package com.dao;

import com.entity.DiscussbaomingrukouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaomingrukouVO;
import com.entity.view.DiscussbaomingrukouView;


/**
 * 报名入口评论表
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:05:00
 */
public interface DiscussbaomingrukouDao extends BaseMapper<DiscussbaomingrukouEntity> {
	
	List<DiscussbaomingrukouVO> selectListVO(@Param("ew") Wrapper<DiscussbaomingrukouEntity> wrapper);
	
	DiscussbaomingrukouVO selectVO(@Param("ew") Wrapper<DiscussbaomingrukouEntity> wrapper);
	
	List<DiscussbaomingrukouView> selectListView(@Param("ew") Wrapper<DiscussbaomingrukouEntity> wrapper);

	List<DiscussbaomingrukouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaomingrukouEntity> wrapper);
	
	DiscussbaomingrukouView selectView(@Param("ew") Wrapper<DiscussbaomingrukouEntity> wrapper);
	
}
