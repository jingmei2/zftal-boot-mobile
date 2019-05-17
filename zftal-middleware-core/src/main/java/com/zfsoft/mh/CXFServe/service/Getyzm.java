
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getyzm", propOrder = {
    "sjhm"
})
public class Getyzm {

    protected String sjhm;

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String value) {
        this.sjhm = value;
    }

}
