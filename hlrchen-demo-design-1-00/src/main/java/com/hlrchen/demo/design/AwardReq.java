package com.hlrchen.demo.design;

public class AwardReq {

    private String uid;
    private int awardType;
    private String awardNumber;
    private String bizId;

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setAwardType(int awardType) {
        this.awardType = awardType;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getUid() {
        return uid;
    }

    public int getAwardType() {
        return awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public String getBizId() {
        return bizId;
    }

    @Override
    public String toString() {
        return "AwardReq{" +
                "uid='" + uid + '\'' +
                ", awardType=" + awardType +
                ", awardNumber='" + awardNumber + '\'' +
                ", bizId='" + bizId + '\'' +
                '}';
    }
}
