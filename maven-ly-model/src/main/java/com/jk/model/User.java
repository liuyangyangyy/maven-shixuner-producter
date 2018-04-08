package com.jk.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Serializable {

    private  Integer id;
    private  String  problemname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblemname() {
        return problemname;
    }

    public void setProblemname(String problemname) {
        this.problemname = problemname;
    }

    public String getCreatetime() {
        if(createtime==null){
            return  null;
        }
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        return sim.format(createtime);
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
