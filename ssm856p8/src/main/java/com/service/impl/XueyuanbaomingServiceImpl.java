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


import com.dao.XueyuanbaomingDao;
import com.entity.XueyuanbaomingEntity;
import com.service.XueyuanbaomingService;
import com.entity.vo.XueyuanbaomingVO;
import com.entity.view.XueyuanbaomingView;

@Service("xueyuanbaomingService")
public class XueyuanbaomingServiceImpl extends ServiceImpl<XueyuanbaomingDao, XueyuanbaomingEntity> implements XueyuanbaomingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueyuanbaomingEntity> page = this.selectPage(
                new Query<XueyuanbaomingEntity>(params).getPage(),
                new EntityWrapper<XueyuanbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueyuanbaomingEntity> wrapper) {
		  Page<XueyuanbaomingView> page =new Query<XueyuanbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueyuanbaomingVO> selectListVO(Wrapper<XueyuanbaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueyuanbaomingVO selectVO(Wrapper<XueyuanbaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueyuanbaomingView> selectListView(Wrapper<XueyuanbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueyuanbaomingView selectView(Wrapper<XueyuanbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
