package com.ssyt.lms.mapper;

import com.ssyt.lms.po.StateInfo;
import com.ssyt.lms.po.StateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StateInfoMapper {
    int countByExample(StateInfoExample example);

    int deleteByExample(StateInfoExample example);

    int deleteByPrimaryKey(Integer stateId);

    int insert(StateInfo record);

    int insertSelective(StateInfo record);

    List<StateInfo> selectByExample(StateInfoExample example);

    StateInfo selectByPrimaryKey(Integer stateId);

    int updateByExampleSelective(@Param("record") StateInfo record, @Param("example") StateInfoExample example);

    int updateByExample(@Param("record") StateInfo record, @Param("example") StateInfoExample example);

    int updateByPrimaryKeySelective(StateInfo record);

    int updateByPrimaryKey(StateInfo record);
}