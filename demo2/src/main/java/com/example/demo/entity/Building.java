package com.example.demo.entity;

import java.util.Date;

public class Building {
    private Integer id;

    private String bname;

    private String badd;

    private Double bsize;

    private Date bdate;

    private Integer bnum;

    private Integer byear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBadd() {
        return badd;
    }

    public void setBadd(String badd) {
        this.badd = badd == null ? null : badd.trim();
    }

    public Double getBsize() {
        return bsize;
    }

    public void setBsize(Double bsize) {
        this.bsize = bsize;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Integer getBnum() {
        return bnum;
    }

    public void setBnum(Integer bnum) {
        this.bnum = bnum;
    }

    public Integer getByear() {
        return byear;
    }

    public void setByear(Integer byear) {
        this.byear = byear;
    }
}