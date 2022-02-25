package com.lq.myapplication.bean;

public class UserBean {
    /**
     * errorCode : -1001
     * errorMsg : 请先登录！
     */

    private Integer errorCode;
    private String errorMsg;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
