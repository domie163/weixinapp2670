package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiakaowenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiakaowenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiakaowenzhangView;


/**
 * 驾考文章
 *
 * @author 
 * @email 
 * @date 2021-12-13 20:04:59
 */
public interface JiakaowenzhangService extends IService<JiakaowenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiakaowenzhangVO> selectListVO(Wrapper<JiakaowenzhangEntity> wrapper);
   	
   	JiakaowenzhangVO selectVO(@Param("ew") Wrapper<JiakaowenzhangEntity> wrapper);
   	
   	List<JiakaowenzhangView> selectListView(Wrapper<JiakaowenzhangEntity> wrapper);
   	
   	JiakaowenzhangView selectView(@Param("ew") Wrapper<JiakaowenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiakaowenzhangEntity> wrapper);
   	
}

