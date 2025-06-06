package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhaoleixingView;


/**
 * 驾照类型
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface JiazhaoleixingService extends IService<JiazhaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhaoleixingVO> selectListVO(Wrapper<JiazhaoleixingEntity> wrapper);
   	
   	JiazhaoleixingVO selectVO(@Param("ew") Wrapper<JiazhaoleixingEntity> wrapper);
   	
   	List<JiazhaoleixingView> selectListView(Wrapper<JiazhaoleixingEntity> wrapper);
   	
   	JiazhaoleixingView selectView(@Param("ew") Wrapper<JiazhaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhaoleixingEntity> wrapper);
   	
}

