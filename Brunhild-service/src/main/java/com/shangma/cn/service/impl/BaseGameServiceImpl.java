package com.shangma.cn.service.impl;

import com.shangma.cn.entity.BaseGame;
import com.shangma.cn.entity.BaseGameExample;
import com.shangma.cn.mapper.BaseGameMapper;
import com.shangma.cn.mapper.TGameuserMapper;
import com.shangma.cn.service.IBaseGameService;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

/**
 * @program: pikachu
 * @description: 用途，
 * @author: 作者
 * @create: 2019/9/39:58
 **/
@Service
public class BaseGameServiceImpl implements IBaseGameService {

    @Autowired
    private BaseGameMapper baseGameMapper;

    @Autowired
    private TGameuserMapper tGameuserMapper;

    @Override
    public List<BaseGame> findByTypeCode(String code) {

        BaseGameExample baseGameExample = new BaseGameExample();
        BaseGameExample.Criteria criteria = baseGameExample.createCriteria();
        criteria.andBaseCodeEqualTo(code);

        return baseGameMapper.selectByExample(baseGameExample);
    }
}
