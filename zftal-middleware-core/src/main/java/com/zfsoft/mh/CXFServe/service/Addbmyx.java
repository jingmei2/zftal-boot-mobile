
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addbmyx", propOrder = {
    "usename",
    "email"
})
public class Addbmyx {

    protected String usename;
    protected String email;

    public String getUsename() {
        return usename;
    }

    public void setUsename(String value) {
        this.usename = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

}
