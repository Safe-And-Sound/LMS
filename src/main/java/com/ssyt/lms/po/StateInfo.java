package com.ssyt.lms.po;

public class StateInfo {
    private Integer stateId;

    private String stateName;

    private Integer identifer;

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName == null ? null : stateName.trim();
    }

    public Integer getIdentifer() {
        return identifer;
    }

    public void setIdentifer(Integer identifer) {
        this.identifer = identifer;
    }
}