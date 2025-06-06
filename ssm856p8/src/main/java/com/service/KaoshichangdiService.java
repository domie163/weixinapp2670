package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshichangdiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshichangdiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshichangdiView;


/**
 * 考试场地
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface KaoshichangdiService extends IService<KaoshichangdiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshichangdiVO> selectListVO(Wrapper<KaoshichangdiEntity> wrapper);
   	
   	KaoshichangdiVO selectVO(@Param("ew") Wrapper<KaoshichangdiEntity> wrapper);
   	
   	List<KaoshichangdiView> selectListView(Wrapper<KaoshichangdiEntity> wrapper);
   	
   	KaoshichangdiView selectView(@Param("ew") Wrapper<KaoshichangdiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshichangdiEntity> wrapper);
   	
}

