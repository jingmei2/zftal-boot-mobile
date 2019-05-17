
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkUse", propOrder = {
    "usename",
    "password"
})
public class CheckUse {

    protected String usename;
    protected String password;


    public String getUsename() {
        return usename;
    }


    public void setUsename(String value) {
        this.usename = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

}
