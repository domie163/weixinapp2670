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


import com.dao.JiazhaoleixingDao;
import com.entity.JiazhaoleixingEntity;
import com.service.JiazhaoleixingService;
import com.entity.vo.JiazhaoleixingVO;
import com.entity.view.JiazhaoleixingView;

@Service("jiazhaoleixingService")
public class JiazhaoleixingServiceImpl extends ServiceImpl<JiazhaoleixingDao, JiazhaoleixingEntity> implements JiazhaoleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhaoleixingEntity> page = this.selectPage(
                new Query<JiazhaoleixingEntity>(params).getPage(),
                new EntityWrapper<JiazhaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhaoleixingEntity> wrapper) {
		  Page<JiazhaoleixingView> page =new Query<JiazhaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhaoleixingVO> selectListVO(Wrapper<JiazhaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhaoleixingVO selectVO(Wrapper<JiazhaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhaoleixingView> selectListView(Wrapper<JiazhaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhaoleixingView selectView(Wrapper<JiazhaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
