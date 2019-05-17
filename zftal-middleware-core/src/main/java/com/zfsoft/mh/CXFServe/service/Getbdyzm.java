
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getbdyzm", propOrder = {
    "sjhm",
    "usename"
})
public class Getbdyzm {

    protected String sjhm;
    protected String usename;

    public String getSjhm() {
        return sjhm;
    }


    public void setSjhm(String value) {
        this.sjhm = value;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String value) {
        this.usename = value;
    }

}
