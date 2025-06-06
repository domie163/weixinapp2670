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


import com.dao.KaoshichangciDao;
import com.entity.KaoshichangciEntity;
import com.service.KaoshichangciService;
import com.entity.vo.KaoshichangciVO;
import com.entity.view.KaoshichangciView;

@Service("kaoshichangciService")
public class KaoshichangciServiceImpl extends ServiceImpl<KaoshichangciDao, KaoshichangciEntity> implements KaoshichangciService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshichangciEntity> page = this.selectPage(
                new Query<KaoshichangciEntity>(params).getPage(),
                new EntityWrapper<KaoshichangciEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshichangciEntity> wrapper) {
		  Page<KaoshichangciView> page =new Query<KaoshichangciView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshichangciVO> selectListVO(Wrapper<KaoshichangciEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshichangciVO selectVO(Wrapper<KaoshichangciEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshichangciView> selectListView(Wrapper<KaoshichangciEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshichangciView selectView(Wrapper<KaoshichangciEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
