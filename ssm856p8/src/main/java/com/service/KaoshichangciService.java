package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshichangciEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshichangciVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshichangciView;


/**
 * 考试场次
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface KaoshichangciService extends IService<KaoshichangciEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshichangciVO> selectListVO(Wrapper<KaoshichangciEntity> wrapper);
   	
   	KaoshichangciVO selectVO(@Param("ew") Wrapper<KaoshichangciEntity> wrapper);
   	
   	List<KaoshichangciView> selectListView(Wrapper<KaoshichangciEntity> wrapper);
   	
   	KaoshichangciView selectView(@Param("ew") Wrapper<KaoshichangciEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshichangciEntity> wrapper);
   	
}

