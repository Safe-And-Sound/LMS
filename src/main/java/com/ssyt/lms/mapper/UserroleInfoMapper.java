package com.ssyt.lms.mapper;

import com.ssyt.lms.po.UserroleInfo;
import com.ssyt.lms.po.UserroleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleInfoMapper {
    int countByExample(UserroleInfoExample example);

    int deleteByExample(UserroleInfoExample example);

    int deleteByPrimaryKey(Integer userroleId);

    int insert(UserroleInfo record);

    int insertSelective(UserroleInfo record);

    List<UserroleInfo> selectByExample(UserroleInfoExample example);

    UserroleInfo selectByPrimaryKey(Integer userroleId);

    int updateByExampleSelective(@Param("record") UserroleInfo record, @Param("example") UserroleInfoExample example);

    int updateByExample(@Param("record") UserroleInfo record, @Param("example") UserroleInfoExample example);

    int updateByPrimaryKeySelective(UserroleInfo record);

    int updateByPrimaryKey(UserroleInfo record);
}