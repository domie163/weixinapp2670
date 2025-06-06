package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaomingrukouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaomingrukouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaomingrukouView;


/**
 * 报名入口评论表
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:05:00
 */
public interface DiscussbaomingrukouService extends IService<DiscussbaomingrukouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaomingrukouVO> selectListVO(Wrapper<DiscussbaomingrukouEntity> wrapper);
   	
   	DiscussbaomingrukouVO selectVO(@Param("ew") Wrapper<DiscussbaomingrukouEntity> wrapper);
   	
   	List<DiscussbaomingrukouView> selectListView(Wrapper<DiscussbaomingrukouEntity> wrapper);
   	
   	DiscussbaomingrukouView selectView(@Param("ew") Wrapper<DiscussbaomingrukouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaomingrukouEntity> wrapper);
   	
}

