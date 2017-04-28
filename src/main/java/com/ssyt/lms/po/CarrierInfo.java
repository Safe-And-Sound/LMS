package com.ssyt.lms.po;

import java.util.Date;

public class CarrierInfo {
    private Integer carrierId;

    private String sendCompany;

    private String sendAddress;

    private String sendLinkman;

    private String sendPhone;

    private String receiveCompany;

    private String receiveAddress;

    private String receiveLinkman;

    private String receivePhone;

    private Date leaverDate;

    private Date receiveDate;

    private Integer carrierState;

    private Double insuranceCost;

    private Double transportCost;

    private Double otherCost;

    private Double totalCost;

    private String remark;

    private Integer userId;

    private Date checkintime;

    private Integer isDelete;

    private Date alterTime;

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public String getSendCompany() {
        return sendCompany;
    }

    public void setSendCompany(String sendCompany) {
        this.sendCompany = sendCompany == null ? null : sendCompany.trim();
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress == null ? null : sendAddress.trim();
    }

    public String getSendLinkman() {
        return sendLinkman;
    }

    public void setSendLinkman(String sendLinkman) {
        this.sendLinkman = sendLinkman == null ? null : sendLinkman.trim();
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone == null ? null : sendPhone.trim();
    }

    public String getReceiveCompany() {
        return receiveCompany;
    }

    public void setReceiveCompany(String receiveCompany) {
        this.receiveCompany = receiveCompany == null ? null : receiveCompany.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public String getReceiveLinkman() {
        return receiveLinkman;
    }

    public void setReceiveLinkman(String receiveLinkman) {
        this.receiveLinkman = receiveLinkman == null ? null : receiveLinkman.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public Date getLeaverDate() {
        return leaverDate;
    }

    public void setLeaverDate(Date leaverDate) {
        this.leaverDate = leaverDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Integer getCarrierState() {
        return carrierState;
    }

    public void setCarrierState(Integer carrierState) {
        this.carrierState = carrierState;
    }

    public Double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public Double getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(Double transportCost) {
        this.transportCost = transportCost;
    }

    public Double getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(Double otherCost) {
        this.otherCost = otherCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getAlterTime() {
        return alterTime;
    }

    public void setAlterTime(Date alterTime) {
        this.alterTime = alterTime;
    }
}