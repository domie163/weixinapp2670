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


import com.dao.JiaxiaoDao;
import com.entity.JiaxiaoEntity;
import com.service.JiaxiaoService;
import com.entity.vo.JiaxiaoVO;
import com.entity.view.JiaxiaoView;

@Service("jiaxiaoService")
public class JiaxiaoServiceImpl extends ServiceImpl<JiaxiaoDao, JiaxiaoEntity> implements JiaxiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaxiaoEntity> page = this.selectPage(
                new Query<JiaxiaoEntity>(params).getPage(),
                new EntityWrapper<JiaxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaxiaoEntity> wrapper) {
		  Page<JiaxiaoView> page =new Query<JiaxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaxiaoVO> selectListVO(Wrapper<JiaxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaxiaoVO selectVO(Wrapper<JiaxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaxiaoView> selectListView(Wrapper<JiaxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaxiaoView selectView(Wrapper<JiaxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
