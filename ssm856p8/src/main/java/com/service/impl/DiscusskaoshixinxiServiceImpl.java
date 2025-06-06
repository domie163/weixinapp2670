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


import com.dao.DiscusskaoshixinxiDao;
import com.entity.DiscusskaoshixinxiEntity;
import com.service.DiscusskaoshixinxiService;
import com.entity.vo.DiscusskaoshixinxiVO;
import com.entity.view.DiscusskaoshixinxiView;

@Service("discusskaoshixinxiService")
public class DiscusskaoshixinxiServiceImpl extends ServiceImpl<DiscusskaoshixinxiDao, DiscusskaoshixinxiEntity> implements DiscusskaoshixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskaoshixinxiEntity> page = this.selectPage(
                new Query<DiscusskaoshixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusskaoshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskaoshixinxiEntity> wrapper) {
		  Page<DiscusskaoshixinxiView> page =new Query<DiscusskaoshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskaoshixinxiVO> selectListVO(Wrapper<DiscusskaoshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskaoshixinxiVO selectVO(Wrapper<DiscusskaoshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskaoshixinxiView> selectListView(Wrapper<DiscusskaoshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskaoshixinxiView selectView(Wrapper<DiscusskaoshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
