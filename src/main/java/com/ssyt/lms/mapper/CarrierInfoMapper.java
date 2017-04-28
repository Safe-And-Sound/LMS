package com.ssyt.lms.mapper;

import com.ssyt.lms.po.CarrierInfo;
import com.ssyt.lms.po.CarrierInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierInfoMapper {
    int countByExample(CarrierInfoExample example);

    int deleteByExample(CarrierInfoExample example);

    int deleteByPrimaryKey(Integer carrierId);

    int insert(CarrierInfo record);

    int insertSelective(CarrierInfo record);

    List<CarrierInfo> selectByExample(CarrierInfoExample example);

    CarrierInfo selectByPrimaryKey(Integer carrierId);

    int updateByExampleSelective(@Param("record") CarrierInfo record, @Param("example") CarrierInfoExample example);

    int updateByExample(@Param("record") CarrierInfo record, @Param("example") CarrierInfoExample example);

    int updateByPrimaryKeySelective(CarrierInfo record);

    int updateByPrimaryKey(CarrierInfo record);
}