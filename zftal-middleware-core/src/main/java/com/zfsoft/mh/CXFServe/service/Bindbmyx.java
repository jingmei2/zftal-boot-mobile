
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindbmyx", propOrder = {
    "usename",
    "radomnumber"
})
public class Bindbmyx {

    protected String usename;
    protected String radomnumber;

    public String getUsename() {
        return usename;
    }


    public void setUsename(String value) {
        this.usename = value;
    }


    public String getRadomnumber() {
        return radomnumber;
    }

    public void setRadomnumber(String value) {
        this.radomnumber = value;
    }

}
