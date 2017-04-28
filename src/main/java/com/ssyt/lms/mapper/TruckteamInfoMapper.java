package com.ssyt.lms.mapper;

import com.ssyt.lms.po.TruckteamInfo;
import com.ssyt.lms.po.TruckteamInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TruckteamInfoMapper {
    int countByExample(TruckteamInfoExample example);

    int deleteByExample(TruckteamInfoExample example);

    int deleteByPrimaryKey(Integer truckteamId);

    int insert(TruckteamInfo record);

    int insertSelective(TruckteamInfo record);

    List<TruckteamInfo> selectByExample(TruckteamInfoExample example);

    TruckteamInfo selectByPrimaryKey(Integer truckteamId);

    int updateByExampleSelective(@Param("record") TruckteamInfo record, @Param("example") TruckteamInfoExample example);

    int updateByExample(@Param("record") TruckteamInfo record, @Param("example") TruckteamInfoExample example);

    int updateByPrimaryKeySelective(TruckteamInfo record);

    int updateByPrimaryKey(TruckteamInfo record);
}