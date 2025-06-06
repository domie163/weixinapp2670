package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiancheyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiancheyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiancheyuyueView;


/**
 * 练车预约
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface LiancheyuyueService extends IService<LiancheyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiancheyuyueVO> selectListVO(Wrapper<LiancheyuyueEntity> wrapper);
   	
   	LiancheyuyueVO selectVO(@Param("ew") Wrapper<LiancheyuyueEntity> wrapper);
   	
   	List<LiancheyuyueView> selectListView(Wrapper<LiancheyuyueEntity> wrapper);
   	
   	LiancheyuyueView selectView(@Param("ew") Wrapper<LiancheyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiancheyuyueEntity> wrapper);
   	
}

