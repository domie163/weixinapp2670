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


import com.dao.DiscussbaomingrukouDao;
import com.entity.DiscussbaomingrukouEntity;
import com.service.DiscussbaomingrukouService;
import com.entity.vo.DiscussbaomingrukouVO;
import com.entity.view.DiscussbaomingrukouView;

@Service("discussbaomingrukouService")
public class DiscussbaomingrukouServiceImpl extends ServiceImpl<DiscussbaomingrukouDao, DiscussbaomingrukouEntity> implements DiscussbaomingrukouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaomingrukouEntity> page = this.selectPage(
                new Query<DiscussbaomingrukouEntity>(params).getPage(),
                new EntityWrapper<DiscussbaomingrukouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaomingrukouEntity> wrapper) {
		  Page<DiscussbaomingrukouView> page =new Query<DiscussbaomingrukouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaomingrukouVO> selectListVO(Wrapper<DiscussbaomingrukouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaomingrukouVO selectVO(Wrapper<DiscussbaomingrukouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaomingrukouView> selectListView(Wrapper<DiscussbaomingrukouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaomingrukouView selectView(Wrapper<DiscussbaomingrukouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
