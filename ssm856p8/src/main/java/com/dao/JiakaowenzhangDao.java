package com.dao;

import com.entity.JiakaowenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiakaowenzhangVO;
import com.entity.view.JiakaowenzhangView;


/**
 * 驾考文章
 * 
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface JiakaowenzhangDao extends BaseMapper<JiakaowenzhangEntity> {
	
	List<JiakaowenzhangVO> selectListVO(@Param("ew") Wrapper<JiakaowenzhangEntity> wrapper);
	
	JiakaowenzhangVO selectVO(@Param("ew") Wrapper<JiakaowenzhangEntity> wrapper);
	
	List<JiakaowenzhangView> selectListView(@Param("ew") Wrapper<JiakaowenzhangEntity> wrapper);

	List<JiakaowenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<JiakaowenzhangEntity> wrapper);
	
	JiakaowenzhangView selectView(@Param("ew") Wrapper<JiakaowenzhangEntity> wrapper);
	
}
