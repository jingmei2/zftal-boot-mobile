
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visitByUserIdResponse", propOrder = {
    "_return"
})
public class VisitByUserIdResponse {

    @XmlElement(name = "return")
    protected String _return;


    public String getReturn() {
        return _return;
    }


    public void setReturn(String value) {
        this._return = value;
    }

}
