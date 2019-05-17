
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBindings", propOrder = {
    "uid"
})
public class GetBindings {

    protected String uid;


    public String getUid() {
        return uid;
    }

    public void setUid(String value) {
        this.uid = value;
    }

}
