package cn.itcast.ssm.po;

public class CmsOnlineAccesscontrol extends CmsOnlineAccesscontrolKey {
    private Integer accessAllowed;

    private Integer accessDenied;

    private Integer accessFlags;

    public Integer getAccessAllowed() {
        return accessAllowed;
    }

    public void setAccessAllowed(Integer accessAllowed) {
        this.accessAllowed = accessAllowed;
    }

    public Integer getAccessDenied() {
        return accessDenied;
    }

    public void setAccessDenied(Integer accessDenied) {
        this.accessDenied = accessDenied;
    }

    public Integer getAccessFlags() {
        return accessFlags;
    }

    public void setAccessFlags(Integer accessFlags) {
        this.accessFlags = accessFlags;
    }
}