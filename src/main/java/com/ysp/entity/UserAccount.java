package com.ysp.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class UserAccount implements Serializable {
    /**
     * 自增主键
     */
    private Integer sqeNo;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型
     */
    private Integer userTypr;

    private static final long serialVersionUID = 1L;

    public Integer getSqeNo() {
        return sqeNo;
    }

    public void setSqeNo(Integer sqeNo) {
        this.sqeNo = sqeNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserTypr() {
        return userTypr;
    }

    public void setUserTypr(Integer userTypr) {
        this.userTypr = userTypr;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserAccount other = (UserAccount) that;
        return (this.getSqeNo() == null ? other.getSqeNo() == null : this.getSqeNo().equals(other.getSqeNo()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUserTypr() == null ? other.getUserTypr() == null : this.getUserTypr().equals(other.getUserTypr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSqeNo() == null) ? 0 : getSqeNo().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUserTypr() == null) ? 0 : getUserTypr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sqeNo=").append(sqeNo);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", userTypr=").append(userTypr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}