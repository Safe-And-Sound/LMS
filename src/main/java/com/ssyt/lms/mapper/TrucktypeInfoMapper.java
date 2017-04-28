package com.ssyt.lms.mapper;

import com.ssyt.lms.po.TrucktypeInfo;
import com.ssyt.lms.po.TrucktypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrucktypeInfoMapper {
    int countByExample(TrucktypeInfoExample example);

    int deleteByExample(TrucktypeInfoExample example);

    int deleteByPrimaryKey(Integer trucktypeId);

    int insert(TrucktypeInfo record);

    int insertSelective(TrucktypeInfo record);

    List<TrucktypeInfo> selectByExample(TrucktypeInfoExample example);

    TrucktypeInfo selectByPrimaryKey(Integer trucktypeId);

    int updateByExampleSelective(@Param("record") TrucktypeInfo record, @Param("example") TrucktypeInfoExample example);

    int updateByExample(@Param("record") TrucktypeInfo record, @Param("example") TrucktypeInfoExample example);

    int updateByPrimaryKeySelective(TrucktypeInfo record);

    int updateByPrimaryKey(TrucktypeInfo record);
}