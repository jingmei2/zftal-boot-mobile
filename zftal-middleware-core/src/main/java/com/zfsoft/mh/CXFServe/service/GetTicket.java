
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTicket", propOrder = {
    "usename",
    "password",
    "remoteurl"
})
public class GetTicket {

    protected String usename;
    protected String password;
    protected String remoteurl;

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

    public String getRemoteurl() {
        return remoteurl;
    }

    public void setRemoteurl(String value) {
        this.remoteurl = value;
    }

}
