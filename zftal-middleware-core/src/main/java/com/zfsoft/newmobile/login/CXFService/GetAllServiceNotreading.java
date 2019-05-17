
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllServiceNotreading", propOrder = {
    "strKey"
})
public class GetAllServiceNotreading {

    protected String strKey;

    public String getStrKey() {
        return strKey;
    }

    public void setStrKey(String value) {
        this.strKey = value;
    }

}
