package com.ysp.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class UserRight implements Serializable {
    /**
     * 用户权力代码
     */
    private Integer userRightCode;

    /**
     * 用户权力说明
     */
    private String userRightName;

    /**
     * 用户角色代码
     */
    private Integer userRoleCode;

    private static final long serialVersionUID = 1L;

    public Integer getUserRightCode() {
        return userRightCode;
    }

    public void setUserRightCode(Integer userRightCode) {
        this.userRightCode = userRightCode;
    }

    public String getUserRightName() {
        return userRightName;
    }

    public void setUserRightName(String userRightName) {
        this.userRightName = userRightName;
    }

    public Integer getUserRoleCode() {
        return userRoleCode;
    }

    public void setUserRoleCode(Integer userRoleCode) {
        this.userRoleCode = userRoleCode;
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
        UserRight other = (UserRight) that;
        return (this.getUserRightCode() == null ? other.getUserRightCode() == null : this.getUserRightCode().equals(other.getUserRightCode()))
            && (this.getUserRightName() == null ? other.getUserRightName() == null : this.getUserRightName().equals(other.getUserRightName()))
            && (this.getUserRoleCode() == null ? other.getUserRoleCode() == null : this.getUserRoleCode().equals(other.getUserRoleCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRightCode() == null) ? 0 : getUserRightCode().hashCode());
        result = prime * result + ((getUserRightName() == null) ? 0 : getUserRightName().hashCode());
        result = prime * result + ((getUserRoleCode() == null) ? 0 : getUserRoleCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRightCode=").append(userRightCode);
        sb.append(", userRightName=").append(userRightName);
        sb.append(", userRoleCode=").append(userRoleCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}