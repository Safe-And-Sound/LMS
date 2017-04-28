package com.ssyt.lms.mapper;

import com.ssyt.lms.po.RolerightInfo;
import com.ssyt.lms.po.RolerightInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolerightInfoMapper {
    int countByExample(RolerightInfoExample example);

    int deleteByExample(RolerightInfoExample example);

    int deleteByPrimaryKey(Integer rolerightId);

    int insert(RolerightInfo record);

    int insertSelective(RolerightInfo record);

    List<RolerightInfo> selectByExample(RolerightInfoExample example);

    RolerightInfo selectByPrimaryKey(Integer rolerightId);

    int updateByExampleSelective(@Param("record") RolerightInfo record, @Param("example") RolerightInfoExample example);

    int updateByExample(@Param("record") RolerightInfo record, @Param("example") RolerightInfoExample example);

    int updateByPrimaryKeySelective(RolerightInfo record);

    int updateByPrimaryKey(RolerightInfo record);
}