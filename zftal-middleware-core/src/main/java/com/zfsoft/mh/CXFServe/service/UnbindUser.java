
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unbindUser", propOrder = {
    "uid",
    "opentype"
})
public class UnbindUser {

    protected String uid;
    protected String opentype;


    public String getUid() {
        return uid;
    }


    public void setUid(String value) {
        this.uid = value;
    }


    public String getOpentype() {
        return opentype;
    }

    public void setOpentype(String value) {
        this.opentype = value;
    }

}
