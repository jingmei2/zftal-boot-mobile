
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buildsjhm", propOrder = {
    "sjhm",
    "yzm"
})
public class Buildsjhm {

    protected String sjhm;
    protected String yzm;

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
