package com.dao;

import com.entity.KaoshichangciEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshichangciVO;
import com.entity.view.KaoshichangciView;


/**
 * 考试场次
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface KaoshichangciDao extends BaseMapper<KaoshichangciEntity> {
	
	List<KaoshichangciVO> selectListVO(@Param("ew") Wrapper<KaoshichangciEntity> wrapper);
	
	KaoshichangciVO selectVO(@Param("ew") Wrapper<KaoshichangciEntity> wrapper);
	
	List<KaoshichangciView> selectListView(@Param("ew") Wrapper<KaoshichangciEntity> wrapper);

	List<KaoshichangciView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshichangciEntity> wrapper);
	
	KaoshichangciView selectView(@Param("ew") Wrapper<KaoshichangciEntity> wrapper);
	
}
