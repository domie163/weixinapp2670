package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiakaowenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiakaowenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiakaowenzhangView;


/**
 * 驾考文章评论表
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:05:00
 */
public interface DiscussjiakaowenzhangService extends IService<DiscussjiakaowenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiakaowenzhangVO> selectListVO(Wrapper<DiscussjiakaowenzhangEntity> wrapper);
   	
   	DiscussjiakaowenzhangVO selectVO(@Param("ew") Wrapper<DiscussjiakaowenzhangEntity> wrapper);
   	
   	List<DiscussjiakaowenzhangView> selectListView(Wrapper<DiscussjiakaowenzhangEntity> wrapper);
   	
   	DiscussjiakaowenzhangView selectView(@Param("ew") Wrapper<DiscussjiakaowenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiakaowenzhangEntity> wrapper);
   	
}

