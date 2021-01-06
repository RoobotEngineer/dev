package com.comac.test;

public class Admin {
    private Long cpcEmpId;
    private String cpcorgEcode;
    private String cpcorgEname;

    public Admin(Long cpcEmpId, String cpcorgEcode, String cpcorgEname) {
        this.cpcEmpId = cpcEmpId;
        this.cpcorgEcode = cpcorgEcode;
        this.cpcorgEname = cpcorgEname;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "cpcEmpId=" + cpcEmpId +
                ", cpcorgEcode='" + cpcorgEcode + '\'' +
                ", cpcorgEname='" + cpcorgEname + '\'' +
                '}';
    }

    public Long getCpcEmpId() {
        return cpcEmpId;
    }

    public void setCpcEmpId(Long cpcEmpId) {
        this.cpcEmpId = cpcEmpId;
    }

    public String getCpcorgEcode() {
        return cpcorgEcode;
    }

    public void setCpcorgEcode(String cpcorgEcode) {
        this.cpcorgEcode = cpcorgEcode;
    }

    public String getCpcorgEname() {
        return cpcorgEname;
    }

    public void setCpcorgEname(String cpcorgEname) {
        this.cpcorgEname = cpcorgEname;
    }
}
