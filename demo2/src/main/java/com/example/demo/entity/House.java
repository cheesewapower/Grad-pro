package com.example.demo.entity;

import java.util.Date;

public class House {
    private Integer id;

    private String housesn;

    private Integer buyid;

    private String buyname;

    private Date houseselldate;

    private Integer houseyear;

    private Double housesize;

    private String housecq;

    private Integer housestatus;

    private Integer houseseller;

    private Integer houseprice;

    private Integer buildingid;

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

    public Integer getHouseyear() {
        return houseyear;
    }

    public void setHouseyear(Integer houseyear) {
        this.houseyear = houseyear;
    }

    public Double getHousesize() {
        return housesize;
    }

    public void setHousesize(Double housesize) {
        this.housesize = housesize;
    }

    public String getHousecq() {
        return housecq;
    }

    public void setHousecq(String housecq) {
        this.housecq = housecq == null ? null : housecq.trim();
    }

    public Integer getHousestatus() {
        return housestatus;
    }

    public void setHousestatus(Integer housestatus) {
        this.housestatus = housestatus;
    }

    public Integer getHouseseller() {
        return houseseller;
    }

    public void setHouseseller(Integer houseseller) {
        this.houseseller = houseseller;
    }

    public Integer getHouseprice() {
        return houseprice;
    }

    public void setHouseprice(Integer houseprice) {
        this.houseprice = houseprice;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }
}