package com.ssyt.lms.po;

public class TrucktypeInfo {
    private Integer trucktypeId;

    private String trucktypeName;

    public Integer getTrucktypeId() {
        return trucktypeId;
    }

    public void setTrucktypeId(Integer trucktypeId) {
        this.trucktypeId = trucktypeId;
    }

    public String getTrucktypeName() {
        return trucktypeName;
    }

    public void setTrucktypeName(String trucktypeName) {
        this.trucktypeName = trucktypeName == null ? null : trucktypeName.trim();
    }
}