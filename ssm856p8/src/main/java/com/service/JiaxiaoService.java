package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaxiaoView;


/**
 * 驾校
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface JiaxiaoService extends IService<JiaxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaxiaoVO> selectListVO(Wrapper<JiaxiaoEntity> wrapper);
   	
   	JiaxiaoVO selectVO(@Param("ew") Wrapper<JiaxiaoEntity> wrapper);
   	
   	List<JiaxiaoView> selectListView(Wrapper<JiaxiaoEntity> wrapper);
   	
   	JiaxiaoView selectView(@Param("ew") Wrapper<JiaxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaxiaoEntity> wrapper);
   	
}

