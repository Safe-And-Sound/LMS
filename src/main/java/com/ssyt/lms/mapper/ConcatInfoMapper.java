package com.ssyt.lms.mapper;

import com.ssyt.lms.po.ConcatInfo;
import com.ssyt.lms.po.ConcatInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConcatInfoMapper {
    int countByExample(ConcatInfoExample example);

    int deleteByExample(ConcatInfoExample example);

    int deleteByPrimaryKey(Integer concatId);

    int insert(ConcatInfo record);

    int insertSelective(ConcatInfo record);

    List<ConcatInfo> selectByExample(ConcatInfoExample example);

    ConcatInfo selectByPrimaryKey(Integer concatId);

    int updateByExampleSelective(@Param("record") ConcatInfo record, @Param("example") ConcatInfoExample example);

    int updateByExample(@Param("record") ConcatInfo record, @Param("example") ConcatInfoExample example);

    int updateByPrimaryKeySelective(ConcatInfo record);

    int updateByPrimaryKey(ConcatInfo record);
}