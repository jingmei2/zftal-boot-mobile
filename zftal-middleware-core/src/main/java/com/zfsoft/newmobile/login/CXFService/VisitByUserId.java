
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visitByUserId", propOrder = {
    "userId",
    "strKey"
})
public class VisitByUserId {

    protected String userId;
    protected String strKey;

    public String getUserId() {
        return userId;
    }


    public void setUserId(String value) {
        this.userId = value;
    }


    public String getStrKey() {
        return strKey;
    }


    public void setStrKey(String value) {
        this.strKey = value;
    }

}
