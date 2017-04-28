package com.ssyt.lms.mapper;

import com.ssyt.lms.po.ScheduleInfo;
import com.ssyt.lms.po.ScheduleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleInfoMapper {
    int countByExample(ScheduleInfoExample example);

    int deleteByExample(ScheduleInfoExample example);

    int deleteByPrimaryKey(Integer scheduleId);

    int insert(ScheduleInfo record);

    int insertSelective(ScheduleInfo record);

    List<ScheduleInfo> selectByExample(ScheduleInfoExample example);

    ScheduleInfo selectByPrimaryKey(Integer scheduleId);

    int updateByExampleSelective(@Param("record") ScheduleInfo record, @Param("example") ScheduleInfoExample example);

    int updateByExample(@Param("record") ScheduleInfo record, @Param("example") ScheduleInfoExample example);

    int updateByPrimaryKeySelective(ScheduleInfo record);

    int updateByPrimaryKey(ScheduleInfo record);
}