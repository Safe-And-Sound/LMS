package com.ssyt.lms.po;

import java.util.Date;

public class TruckteamInfo {
    private Integer truckteamId;

    private String teamName;

    private String leader;

    private String remark;

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

    public Integer getTruckteamId() {
        return truckteamId;
    }

    public void setTruckteamId(Integer truckteamId) {
        this.truckteamId = truckteamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
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