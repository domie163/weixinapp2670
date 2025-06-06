package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuanbaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuanbaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuanbaomingView;


/**
 * 学员报名
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface XueyuanbaomingService extends IService<XueyuanbaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuanbaomingVO> selectListVO(Wrapper<XueyuanbaomingEntity> wrapper);
   	
   	XueyuanbaomingVO selectVO(@Param("ew") Wrapper<XueyuanbaomingEntity> wrapper);
   	
   	List<XueyuanbaomingView> selectListView(Wrapper<XueyuanbaomingEntity> wrapper);
   	
   	XueyuanbaomingView selectView(@Param("ew") Wrapper<XueyuanbaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuanbaomingEntity> wrapper);
   	
}

