package com.ssyt.lms.po;

import java.util.Date;

public class ScheduleInfo {
    private Integer scheduleId;

    private Date startTime;

    private Integer carrierId;

    private Integer truckId;

    private Long oilcost;

    private Long toll;

    private Long fine;

    private Long othercost;

    private Long totalcost;

    private Integer userId;

    private String remark;

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Long getOilcost() {
        return oilcost;
    }

    public void setOilcost(Long oilcost) {
        this.oilcost = oilcost;
    }

    public Long getToll() {
        return toll;
    }

    public void setToll(Long toll) {
        this.toll = toll;
    }

    public Long getFine() {
        return fine;
    }

    public void setFine(Long fine) {
        this.fine = fine;
    }

    public Long getOthercost() {
        return othercost;
    }

    public void setOthercost(Long othercost) {
        this.othercost = othercost;
    }

    public Long getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Long totalcost) {
        this.totalcost = totalcost;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Date getAltertime() {
        return altertime;
    }

    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }
}