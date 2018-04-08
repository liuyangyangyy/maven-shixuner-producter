package com.jk.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vip implements Serializable {
    private static final long serialVersionUID = -159741073835702821L;

    //主键id
    private Integer id;

    //用户名
    private String  vipname;

    //用户等级
    private String  levelname;

    //邮箱
    private String  email;

    //创建日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date   createtime;

    //状态
    private  Integer flg;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVipname() {
        return vipname;
    }

    public void setVipname(String vipname) {
        this.vipname = vipname;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatetime() {
        if(createtime==null){
            return null;
        }
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        return sim.format(createtime);
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFlg() {
        return flg;
    }

    public void setFlg(Integer flg) {
        this.flg = flg;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", vipname='" + vipname + '\'' +
                ", levelname='" + levelname + '\'' +
                ", email='" + email + '\'' +
                ", createtime=" + createtime +
                ", flg=" + flg +
                '}';
    }
}
