package com.shangma.cn.mapper;

import com.shangma.cn.entity.TGameuser;
import com.shangma.cn.entity.TGameuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TGameuserMapper {
    int countByExample(TGameuserExample example);

    int deleteByExample(TGameuserExample example);

    int deleteByPrimaryKey(Integer gameId);

    int insert(TGameuser record);

    int insertSelective(TGameuser record);

    List<TGameuser> selectByExample(TGameuserExample example);

    TGameuser selectByPrimaryKey(Integer gameId);

    int updateByExampleSelective(@Param("record") TGameuser record, @Param("example") TGameuserExample example);

    int updateByExample(@Param("record") TGameuser record, @Param("example") TGameuserExample example);

    int updateByPrimaryKeySelective(TGameuser record);

    int updateByPrimaryKey(TGameuser record);
}