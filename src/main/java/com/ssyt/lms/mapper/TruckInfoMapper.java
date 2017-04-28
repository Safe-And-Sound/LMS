package com.ssyt.lms.mapper;

import com.ssyt.lms.po.TruckInfo;
import com.ssyt.lms.po.TruckInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TruckInfoMapper {
    int countByExample(TruckInfoExample example);

    int deleteByExample(TruckInfoExample example);

    int deleteByPrimaryKey(Integer truckId);

    int insert(TruckInfo record);

    int insertSelective(TruckInfo record);

    List<TruckInfo> selectByExample(TruckInfoExample example);

    TruckInfo selectByPrimaryKey(Integer truckId);

    int updateByExampleSelective(@Param("record") TruckInfo record, @Param("example") TruckInfoExample example);

    int updateByExample(@Param("record") TruckInfo record, @Param("example") TruckInfoExample example);

    int updateByPrimaryKeySelective(TruckInfo record);

    int updateByPrimaryKey(TruckInfo record);
}