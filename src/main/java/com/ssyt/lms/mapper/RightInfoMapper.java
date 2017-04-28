package com.ssyt.lms.mapper;

import com.ssyt.lms.po.RightInfo;
import com.ssyt.lms.po.RightInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightInfoMapper {
    int countByExample(RightInfoExample example);

    int deleteByExample(RightInfoExample example);

    int deleteByPrimaryKey(Integer rightId);

    int insert(RightInfo record);

    int insertSelective(RightInfo record);

    List<RightInfo> selectByExample(RightInfoExample example);

    RightInfo selectByPrimaryKey(Integer rightId);

    int updateByExampleSelective(@Param("record") RightInfo record, @Param("example") RightInfoExample example);

    int updateByExample(@Param("record") RightInfo record, @Param("example") RightInfoExample example);

    int updateByPrimaryKeySelective(RightInfo record);

    int updateByPrimaryKey(RightInfo record);
}