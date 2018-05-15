package com.example.demo.entity;

import java.util.Date;

public class Buyer {
    private Integer id;

    private String buyname;

    private String buysti;

    private Date buydate;

    private Integer houseid;

    private Integer buyincome;

    private String buytype;

    private String buyhj;

    private String buyphone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyname() {
        return buyname;
    }

    public void setBuyname(String buyname) {
        this.buyname = buyname == null ? null : buyname.trim();
    }

    public String getBuysti() {
        return buysti;
    }

    public void setBuysti(String buysti) {
        this.buysti = buysti == null ? null : buysti.trim();
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getBuyincome() {
        return buyincome;
    }

    public void setBuyincome(Integer buyincome) {
        this.buyincome = buyincome;
    }

    public String getBuytype() {
        return buytype;
    }

    public void setBuytype(String buytype) {
        this.buytype = buytype == null ? null : buytype.trim();
    }

    public String getBuyhj() {
        return buyhj;
    }

    public void setBuyhj(String buyhj) {
        this.buyhj = buyhj == null ? null : buyhj.trim();
    }

    public String getBuyphone() {
        return buyphone;
    }

    public void setBuyphone(String buyphone) {
        this.buyphone = buyphone == null ? null : buyphone.trim();
    }
}