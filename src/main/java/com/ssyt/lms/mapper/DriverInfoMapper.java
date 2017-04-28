package com.ssyt.lms.mapper;

import com.ssyt.lms.po.DriverInfo;
import com.ssyt.lms.po.DriverInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverInfoMapper {
    int countByExample(DriverInfoExample example);

    int deleteByExample(DriverInfoExample example);

    int deleteByPrimaryKey(Integer driverId);

    int insert(DriverInfo record);

    int insertSelective(DriverInfo record);

    List<DriverInfo> selectByExample(DriverInfoExample example);

    DriverInfo selectByPrimaryKey(Integer driverId);

    int updateByExampleSelective(@Param("record") DriverInfo record, @Param("example") DriverInfoExample example);

    int updateByExample(@Param("record") DriverInfo record, @Param("example") DriverInfoExample example);

    int updateByPrimaryKeySelective(DriverInfo record);

    int updateByPrimaryKey(DriverInfo record);
}