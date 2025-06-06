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


import com.dao.JiakaowenzhangDao;
import com.entity.JiakaowenzhangEntity;
import com.service.JiakaowenzhangService;
import com.entity.vo.JiakaowenzhangVO;
import com.entity.view.JiakaowenzhangView;

@Service("jiakaowenzhangService")
public class JiakaowenzhangServiceImpl extends ServiceImpl<JiakaowenzhangDao, JiakaowenzhangEntity> implements JiakaowenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiakaowenzhangEntity> page = this.selectPage(
                new Query<JiakaowenzhangEntity>(params).getPage(),
                new EntityWrapper<JiakaowenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiakaowenzhangEntity> wrapper) {
		  Page<JiakaowenzhangView> page =new Query<JiakaowenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiakaowenzhangVO> selectListVO(Wrapper<JiakaowenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiakaowenzhangVO selectVO(Wrapper<JiakaowenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiakaowenzhangView> selectListView(Wrapper<JiakaowenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiakaowenzhangView selectView(Wrapper<JiakaowenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
