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


import com.dao.BaomingrukouDao;
import com.entity.BaomingrukouEntity;
import com.service.BaomingrukouService;
import com.entity.vo.BaomingrukouVO;
import com.entity.view.BaomingrukouView;

@Service("baomingrukouService")
public class BaomingrukouServiceImpl extends ServiceImpl<BaomingrukouDao, BaomingrukouEntity> implements BaomingrukouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaomingrukouEntity> page = this.selectPage(
                new Query<BaomingrukouEntity>(params).getPage(),
                new EntityWrapper<BaomingrukouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaomingrukouEntity> wrapper) {
		  Page<BaomingrukouView> page =new Query<BaomingrukouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaomingrukouVO> selectListVO(Wrapper<BaomingrukouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaomingrukouVO selectVO(Wrapper<BaomingrukouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaomingrukouView> selectListView(Wrapper<BaomingrukouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaomingrukouView selectView(Wrapper<BaomingrukouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
