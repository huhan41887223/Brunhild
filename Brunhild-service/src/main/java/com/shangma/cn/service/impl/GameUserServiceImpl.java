package com.shangma.cn.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangma.cn.entity.BaseGame;
import com.shangma.cn.entity.BaseGameExample;
import com.shangma.cn.entity.PageBean;
import com.shangma.cn.entity.TGameuser;
import com.shangma.cn.mapper.BaseGameMapper;
import com.shangma.cn.mapper.TGameuserMapper;
import com.shangma.cn.service.IGameUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GameUserServiceImpl implements IGameUserService {

    @Autowired
    private TGameuserMapper getGameAddress;

    @Autowired
    private BaseGameMapper baseGameMapper;


    @Override
    public PageBean<TGameuser> selectAll(Integer currentPage, Integer pageSize) {

//        分页插件jar包调用方法 先写死
        PageHelper.startPage(currentPage, pageSize);
        //存储。
        List<TGameuser> gameUserBeans = getGameAddress.selectByExample(null);
        //遍历 存值

        PageBean<TGameuser> pageBean = null;
        for (TGameuser gameUserBean : gameUserBeans) {


////          NPC出生地自定义语句查询 根据basetype来查询
            int address = gameUserBean.getGameAddress();
            BaseGameExample baseGameExample = new BaseGameExample();
            BaseGameExample.Criteria criteria = baseGameExample.createCriteria();
            criteria.andBaseTypeEqualTo(address);
            List<BaseGame> baseGames = baseGameMapper.selectByExample(baseGameExample);
            String addressName = baseGames.get(0).getBaseContent();
//
////           职业
            Integer job = gameUserBean.getGameJob();
            BaseGameExample baseGameExample1 = new BaseGameExample();
            BaseGameExample.Criteria criteria1 = baseGameExample1.createCriteria();
            criteria1.andBaseTypeEqualTo(job);
            List<BaseGame> baseGames1 = baseGameMapper.selectByExample(baseGameExample1);
            String jobName = baseGames1.get(0).getBaseContent();
//
////           种族
            Integer race = gameUserBean.getGameRace();
            BaseGameExample baseGameExample2 = new BaseGameExample();
            BaseGameExample.Criteria criteria2 = baseGameExample2.createCriteria();
            criteria2.andBaseTypeEqualTo(race);
            List<BaseGame> baseGames2 = baseGameMapper.selectByExample(baseGameExample2);
            String raceName = baseGames2.get(0).getBaseContent();
//            阵营
            Integer camp = gameUserBean.getGameCamp();
            BaseGameExample baseGameExample3 = new BaseGameExample();

            BaseGameExample.Criteria criteria3 = baseGameExample3.createCriteria();
            criteria3.andBaseTypeEqualTo(camp);
            List<BaseGame> baseGames3 = baseGameMapper.selectByExample(baseGameExample3);
            String campName = baseGames3.get(0).getBaseContent();

////          遍历所有的中文给到GameuserBean中
            gameUserBean.setGameRaceName(raceName);
            gameUserBean.setGameJobName(jobName);
            gameUserBean.setGameCampName(campName);
            gameUserBean.setGameAddressName(addressName);
//
//            //得到分页jar包下的子类方法获取总数
            PageInfo<TGameuser> pageInfo = new PageInfo<>(gameUserBeans);
            long total = pageInfo.getTotal();
            pageBean = new PageBean<TGameuser>();
            pageBean.setData(gameUserBeans);
            pageBean.setTotal(total);
//


        }

        return pageBean;
    }

    @Override
    public TGameuser selectByPrimaryKey(Integer id) {

        TGameuser tGameuser = getGameAddress.selectByPrimaryKey(id);
        int addressBase = tGameuser.getGameAddress();
        BaseGameExample baseGameExample = new BaseGameExample();
        BaseGameExample.Criteria criteria = baseGameExample.createCriteria();
        criteria.andBaseTypeEqualTo(addressBase);
        List<BaseGame> baseGames = baseGameMapper.selectByExample(baseGameExample);
        String addressName = baseGames.get(0).getBaseContent();
        tGameuser.setGameAddressName(addressName);
        return  tGameuser;
    }

    @Override
    public void update(TGameuser tGameuser) {

        System.out.println("進入修改步驟");
        getGameAddress.updateByPrimaryKeySelective(tGameuser);
    }

}