package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LiancheyuyueDao;
import com.entity.LiancheyuyueEntity;
import com.service.LiancheyuyueService;
import com.entity.vo.LiancheyuyueVO;
import com.entity.view.LiancheyuyueView;

@Service("liancheyuyueService")
public class LiancheyuyueServiceImpl extends ServiceImpl<LiancheyuyueDao, LiancheyuyueEntity> implements LiancheyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiancheyuyueEntity> page = this.selectPage(
                new Query<LiancheyuyueEntity>(params).getPage(),
                new EntityWrapper<LiancheyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiancheyuyueEntity> wrapper) {
		  Page<LiancheyuyueView> page =new Query<LiancheyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiancheyuyueVO> selectListVO(Wrapper<LiancheyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiancheyuyueVO selectVO(Wrapper<LiancheyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiancheyuyueView> selectListView(Wrapper<LiancheyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiancheyuyueView selectView(Wrapper<LiancheyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
