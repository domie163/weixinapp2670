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


import com.dao.DiscussjiakaowenzhangDao;
import com.entity.DiscussjiakaowenzhangEntity;
import com.service.DiscussjiakaowenzhangService;
import com.entity.vo.DiscussjiakaowenzhangVO;
import com.entity.view.DiscussjiakaowenzhangView;

@Service("discussjiakaowenzhangService")
public class DiscussjiakaowenzhangServiceImpl extends ServiceImpl<DiscussjiakaowenzhangDao, DiscussjiakaowenzhangEntity> implements DiscussjiakaowenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiakaowenzhangEntity> page = this.selectPage(
                new Query<DiscussjiakaowenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscussjiakaowenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiakaowenzhangEntity> wrapper) {
		  Page<DiscussjiakaowenzhangView> page =new Query<DiscussjiakaowenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiakaowenzhangVO> selectListVO(Wrapper<DiscussjiakaowenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiakaowenzhangVO selectVO(Wrapper<DiscussjiakaowenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiakaowenzhangView> selectListView(Wrapper<DiscussjiakaowenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiakaowenzhangView selectView(Wrapper<DiscussjiakaowenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
