
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelprobyphone", propOrder = {
    "usename",
    "sjhm",
    "yzm"
})
public class Cancelprobyphone {

    protected String usename;
    protected String sjhm;
    protected String yzm;

    public String getUsename() {
        return usename;
    }


    public void setUsename(String value) {
        this.usename = value;
    }


    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String value) {
        this.sjhm = value;
    }

    public String getYzm() {
        return yzm;
    }


    public void setYzm(String value) {
        this.yzm = value;
    }

}
