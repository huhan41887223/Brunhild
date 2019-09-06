package com.shangma.cn.controller;


import com.shangma.cn.entity.BaseGame;
import com.shangma.cn.entity.PageBean;
import com.shangma.cn.entity.TGameuser;
import com.shangma.cn.mapper.BaseGameMapper;
import com.shangma.cn.service.IGameUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @program: pikachu
 * @description: 用途，
 * @author: 作者
 * @create: 2019/8/2619:17
 **/
@Controller
public class UserGameController {

    @Autowired
    private IGameUserService iGameUserService;



    @GetMapping("selectAll")
    public ResponseEntity<PageBean<TGameuser>> selectAll(Integer currentPage, Integer pageSize){
        if (currentPage <=0){
            currentPage =1;
        }
        if (pageSize<=0){
            pageSize=5;
        }


        return ResponseEntity.ok(iGameUserService.selectAll(currentPage,pageSize));

    }


    @GetMapping("findNPCById/{id}")
    public ResponseEntity<TGameuser> findNPCById(@PathVariable int id){


        return ResponseEntity.ok(iGameUserService.selectByPrimaryKey(id));
    }

//修改后返回一个成功
@PutMapping("update")
    public ResponseEntity<String> update(TGameuser tGameuser){
    System.out.println(tGameuser.toString());
        iGameUserService.update(tGameuser);

        return ResponseEntity.ok("succeed");
    }



}
