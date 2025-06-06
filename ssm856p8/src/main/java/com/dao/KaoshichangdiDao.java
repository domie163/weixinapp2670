package com.dao;

import com.entity.KaoshichangdiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshichangdiVO;
import com.entity.view.KaoshichangdiView;


/**
 * 考试场地
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface KaoshichangdiDao extends BaseMapper<KaoshichangdiEntity> {
	
	List<KaoshichangdiVO> selectListVO(@Param("ew") Wrapper<KaoshichangdiEntity> wrapper);
	
	KaoshichangdiVO selectVO(@Param("ew") Wrapper<KaoshichangdiEntity> wrapper);
	
	List<KaoshichangdiView> selectListView(@Param("ew") Wrapper<KaoshichangdiEntity> wrapper);

	List<KaoshichangdiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshichangdiEntity> wrapper);
	
	KaoshichangdiView selectView(@Param("ew") Wrapper<KaoshichangdiEntity> wrapper);
	
}
