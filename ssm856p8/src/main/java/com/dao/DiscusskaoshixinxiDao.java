package com.dao;

import com.entity.DiscusskaoshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskaoshixinxiVO;
import com.entity.view.DiscusskaoshixinxiView;


/**
 * 考试信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:05:00
 */
public interface DiscusskaoshixinxiDao extends BaseMapper<DiscusskaoshixinxiEntity> {
	
	List<DiscusskaoshixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusskaoshixinxiEntity> wrapper);
	
	DiscusskaoshixinxiVO selectVO(@Param("ew") Wrapper<DiscusskaoshixinxiEntity> wrapper);
	
	List<DiscusskaoshixinxiView> selectListView(@Param("ew") Wrapper<DiscusskaoshixinxiEntity> wrapper);

	List<DiscusskaoshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskaoshixinxiEntity> wrapper);
	
	DiscusskaoshixinxiView selectView(@Param("ew") Wrapper<DiscusskaoshixinxiEntity> wrapper);
	
}
