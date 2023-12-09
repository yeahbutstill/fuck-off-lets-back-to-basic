package com.zamannow.testsoaljava.junior.day3;

public class Customer {
    private int userId;
    private String userCd;
    private String firstNm;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserCd(String userCd) {
        this.userCd = userCd;
    }

    public String getUserCd() {
        return userCd;
    }

    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    public String getFirstNm() {
        return firstNm;
    }
}
