package com.shangma.cn.controller;

import com.shangma.cn.entity.BaseGame;
import com.shangma.cn.service.IBaseGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @program: pikachu
 * @description: 用途，
 * @author: 作者
 * @create: 2019/9/39:57
 **/
@Controller
@Transactional
public class BaseGameController {

    @Autowired
    private IBaseGameService iBaseGameService;

    @GetMapping("findByTypeCode/{code}")
    public ResponseEntity<List<BaseGame>> findByTypeCode(@PathVariable String code){



      return ResponseEntity.ok(iBaseGameService.findByTypeCode(code));
    }



}
