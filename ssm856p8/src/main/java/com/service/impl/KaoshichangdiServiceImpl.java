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


import com.dao.KaoshichangdiDao;
import com.entity.KaoshichangdiEntity;
import com.service.KaoshichangdiService;
import com.entity.vo.KaoshichangdiVO;
import com.entity.view.KaoshichangdiView;

@Service("kaoshichangdiService")
public class KaoshichangdiServiceImpl extends ServiceImpl<KaoshichangdiDao, KaoshichangdiEntity> implements KaoshichangdiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshichangdiEntity> page = this.selectPage(
                new Query<KaoshichangdiEntity>(params).getPage(),
                new EntityWrapper<KaoshichangdiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshichangdiEntity> wrapper) {
		  Page<KaoshichangdiView> page =new Query<KaoshichangdiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshichangdiVO> selectListVO(Wrapper<KaoshichangdiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshichangdiVO selectVO(Wrapper<KaoshichangdiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshichangdiView> selectListView(Wrapper<KaoshichangdiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshichangdiView selectView(Wrapper<KaoshichangdiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
