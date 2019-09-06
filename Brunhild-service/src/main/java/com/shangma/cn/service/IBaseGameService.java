package com.shangma.cn.service;

import com.shangma.cn.entity.BaseGame;

import java.util.List;

/**
 * @program: pikachu
 * @description: 用途，
 * @author: 作者
 * @create: 2019/9/39:59
 **/
public interface IBaseGameService {

    List<BaseGame> findByTypeCode(String baseCode);

}
