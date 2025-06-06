package com.dao;

import com.entity.KaoshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshixinxiVO;
import com.entity.view.KaoshixinxiView;


/**
 * 考试信息
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface KaoshixinxiDao extends BaseMapper<KaoshixinxiEntity> {
	
	List<KaoshixinxiVO> selectListVO(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);
	
	KaoshixinxiVO selectVO(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);
	
	List<KaoshixinxiView> selectListView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

	List<KaoshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);
	
	KaoshixinxiView selectView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);
	
}
