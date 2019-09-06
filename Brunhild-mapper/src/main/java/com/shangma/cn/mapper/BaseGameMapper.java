package com.shangma.cn.mapper;

import com.shangma.cn.entity.BaseGame;
import com.shangma.cn.entity.BaseGameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseGameMapper {
    int countByExample(BaseGameExample example);

    int deleteByExample(BaseGameExample example);

    int deleteByPrimaryKey(Integer baseId);

    int insert(BaseGame record);

    int insertSelective(BaseGame record);

    List<BaseGame> selectByExample(BaseGameExample example);

    BaseGame selectByPrimaryKey(Integer baseId);

    int updateByExampleSelective(@Param("record") BaseGame record, @Param("example") BaseGameExample example);

    int updateByExample(@Param("record") BaseGame record, @Param("example") BaseGameExample example);

    int updateByPrimaryKeySelective(BaseGame record);

    int updateByPrimaryKey(BaseGame record);
}