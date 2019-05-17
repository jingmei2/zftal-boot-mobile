
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getYwxtUser", propOrder = {
    "xtdm",
    "usename"
})
public class GetYwxtUser {

    protected String xtdm;
    protected String usename;


    public String getXtdm() {
        return xtdm;
    }


    public void setXtdm(String value) {
        this.xtdm = value;
    }


    public String getUsename() {
        return usename;
    }


    public void setUsename(String value) {
        this.usename = value;
    }

}
