package com.example.demo.entity;

public class Staff {
    private Integer id;

    private String staffname;

    private String staffde;

    private Integer staffmoney;

    private Integer stafflever;

    private String staffdesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffde() {
        return staffde;
    }

    public void setStaffde(String staffde) {
        this.staffde = staffde == null ? null : staffde.trim();
    }

    public Integer getStaffmoney() {
        return staffmoney;
    }

    public void setStaffmoney(Integer staffmoney) {
        this.staffmoney = staffmoney;
    }

    public Integer getStafflever() {
        return stafflever;
    }

    public void setStafflever(Integer stafflever) {
        this.stafflever = stafflever;
    }

    public String getStaffdesc() {
        return staffdesc;
    }

    public void setStaffdesc(String staffdesc) {
        this.staffdesc = staffdesc == null ? null : staffdesc.trim();
    }
}