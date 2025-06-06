package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaomingrukouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaomingrukouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaomingrukouView;


/**
 * 报名入口
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface BaomingrukouService extends IService<BaomingrukouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaomingrukouVO> selectListVO(Wrapper<BaomingrukouEntity> wrapper);
   	
   	BaomingrukouVO selectVO(@Param("ew") Wrapper<BaomingrukouEntity> wrapper);
   	
   	List<BaomingrukouView> selectListView(Wrapper<BaomingrukouEntity> wrapper);
   	
   	BaomingrukouView selectView(@Param("ew") Wrapper<BaomingrukouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaomingrukouEntity> wrapper);
   	
}

