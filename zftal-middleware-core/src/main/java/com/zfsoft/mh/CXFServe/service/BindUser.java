
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindUser", propOrder = {
    "uid",
    "openid",
    "opentype"
})
public class BindUser {

    protected String uid;
    protected String openid;
    protected String opentype;

    public String getUid() {
        return uid;
    }

    public void setUid(String value) {
        this.uid = value;
    }


    public String getOpenid() {
        return openid;
    }


    public void setOpenid(String value) {
        this.openid = value;
    }

    public String getOpentype() {
        return opentype;
    }

    public void setOpentype(String value) {
        this.opentype = value;
    }

}
