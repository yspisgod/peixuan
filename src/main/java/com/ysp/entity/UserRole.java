package com.ysp.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class UserRole implements Serializable {
    /**
     * 用户角色名称
     */
    private String userRoleName;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 用户角色代码
     */
    private Integer userRoleCode;

    private static final long serialVersionUID = 1L;

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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
        UserRole other = (UserRole) that;
        return (this.getUserRoleName() == null ? other.getUserRoleName() == null : this.getUserRoleName().equals(other.getUserRoleName()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getUserRoleCode() == null ? other.getUserRoleCode() == null : this.getUserRoleCode().equals(other.getUserRoleCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRoleName() == null) ? 0 : getUserRoleName().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getUserRoleCode() == null) ? 0 : getUserRoleCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRoleName=").append(userRoleName);
        sb.append(", userType=").append(userType);
        sb.append(", userRoleCode=").append(userRoleCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}