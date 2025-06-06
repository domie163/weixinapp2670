package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskaoshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskaoshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskaoshixinxiView;


/**
 * 考试信息评论表
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:05:00
 */
public interface DiscusskaoshixinxiService extends IService<DiscusskaoshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskaoshixinxiVO> selectListVO(Wrapper<DiscusskaoshixinxiEntity> wrapper);
   	
   	DiscusskaoshixinxiVO selectVO(@Param("ew") Wrapper<DiscusskaoshixinxiEntity> wrapper);
   	
   	List<DiscusskaoshixinxiView> selectListView(Wrapper<DiscusskaoshixinxiEntity> wrapper);
   	
   	DiscusskaoshixinxiView selectView(@Param("ew") Wrapper<DiscusskaoshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskaoshixinxiEntity> wrapper);
   	
}

