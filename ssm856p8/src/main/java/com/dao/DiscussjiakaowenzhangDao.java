package com.dao;

import com.entity.DiscussjiakaowenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiakaowenzhangVO;
import com.entity.view.DiscussjiakaowenzhangView;


/**
 * 驾考文章评论表
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:05:00
 */
public interface DiscussjiakaowenzhangDao extends BaseMapper<DiscussjiakaowenzhangEntity> {
	
	List<DiscussjiakaowenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussjiakaowenzhangEntity> wrapper);
	
	DiscussjiakaowenzhangVO selectVO(@Param("ew") Wrapper<DiscussjiakaowenzhangEntity> wrapper);
	
	List<DiscussjiakaowenzhangView> selectListView(@Param("ew") Wrapper<DiscussjiakaowenzhangEntity> wrapper);

	List<DiscussjiakaowenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiakaowenzhangEntity> wrapper);
	
	DiscussjiakaowenzhangView selectView(@Param("ew") Wrapper<DiscussjiakaowenzhangEntity> wrapper);
	
}
