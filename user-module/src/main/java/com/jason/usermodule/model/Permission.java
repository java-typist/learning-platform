package com.jason.usermodule.model;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2020/3/13 13:38
 * @modify 2020/3/13 13:38
 */
public class Permission {
    private Integer permId;
    private String permName;
    private String permDescription;

    public Integer getPermId() {
        return permId;
    }

    public void setPermId(Integer permId) {
        this.permId = permId;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getPermDescription() {
        return permDescription;
    }

    public void setPermDescription(String permDescription) {
        this.permDescription = permDescription;
    }
}
