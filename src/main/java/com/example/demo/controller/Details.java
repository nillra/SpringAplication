package com.example.demo.controller;

//import org.springframework.stereotype.Component;


public class Details {

    private String stdname;
    private int stdid;
    private String branch;

    public Details(String name,int id,String br) {
    	this.stdname=name;
    	this.stdid=id;
    	this.branch=br;
        // Spring can use this constructor
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getStdname() {
        return stdname;
    }

    public int getStdid() {
        return stdid;
    }

    public String getBranch() {
        return branch;
    }
}
