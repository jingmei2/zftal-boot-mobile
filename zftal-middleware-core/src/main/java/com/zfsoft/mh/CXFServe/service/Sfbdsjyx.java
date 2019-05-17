
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfbdsjyx", propOrder = {
    "usename"
})
public class Sfbdsjyx {

    protected String usename;


    public String getUsename() {
        return usename;
    }

    public void setUsename(String value) {
        this.usename = value;
    }

}
