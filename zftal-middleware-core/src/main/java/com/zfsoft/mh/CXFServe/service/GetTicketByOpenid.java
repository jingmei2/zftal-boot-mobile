
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTicketByOpenid", propOrder = {
    "openid"
})
public class GetTicketByOpenid {

    protected String openid;


    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String value) {
        this.openid = value;
    }

}
