package com.shangma.cn.service;


import com.shangma.cn.entity.PageBean;
import com.shangma.cn.entity.TGameuser;

/**
 * @program: pikachu
 * @description: 用途，
 * @author: 作者
 * @create: 2019/8/2619:34
 **/

public interface IGameUserService {

    PageBean<TGameuser> selectAll(Integer currentPage, Integer pageSize);

//根据主键查询所有
    TGameuser selectByPrimaryKey(Integer id);

    void update(TGameuser tGameuser);
}
