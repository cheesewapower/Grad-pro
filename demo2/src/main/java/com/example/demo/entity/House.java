package com.example.demo.entity;

import java.util.Date;

public class House {
    private Integer id;

    private String housesn;

    private Integer buyid;

    private String buyname;

    private Date houseselldate;

    private String housestruc;

    private String houseadd;

    private String houseyear;

    private Double housesize;

    private Integer hosuecq;

    private String housestatus;

    private String houseseller;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHousesn() {
        return housesn;
    }

    public void setHousesn(String housesn) {
        this.housesn = housesn == null ? null : housesn.trim();
    }

    public Integer getBuyid() {
        return buyid;
    }

    public void setBuyid(Integer buyid) {
        this.buyid = buyid;
    }

    public String getBuyname() {
        return buyname;
    }

    public void setBuyname(String buyname) {
        this.buyname = buyname == null ? null : buyname.trim();
    }

    public Date getHouseselldate() {
        return houseselldate;
    }

    public void setHouseselldate(Date houseselldate) {
        this.houseselldate = houseselldate;
    }

    public String getHousestruc() {
        return housestruc;
    }

    public void setHousestruc(String housestruc) {
        this.housestruc = housestruc == null ? null : housestruc.trim();
    }

    public String getHouseadd() {
        return houseadd;
    }

    public void setHouseadd(String houseadd) {
        this.houseadd = houseadd == null ? null : houseadd.trim();
    }

    public String getHouseyear() {
        return houseyear;
    }

    public void setHouseyear(String houseyear) {
        this.houseyear = houseyear == null ? null : houseyear.trim();
    }

    public Double getHousesize() {
        return housesize;
    }

    public void setHousesize(Double housesize) {
        this.housesize = housesize;
    }

    public Integer getHosuecq() {
        return hosuecq;
    }

    public void setHosuecq(Integer hosuecq) {
        this.hosuecq = hosuecq;
    }

    public String getHousestatus() {
        return housestatus;
    }

    public void setHousestatus(String housestatus) {
        this.housestatus = housestatus == null ? null : housestatus.trim();
    }

    public String getHouseseller() {
        return houseseller;
    }

    public void setHouseseller(String houseseller) {
        this.houseseller = houseseller == null ? null : houseseller.trim();
    }
}