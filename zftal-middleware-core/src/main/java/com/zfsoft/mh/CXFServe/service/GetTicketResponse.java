
package com.zfsoft.mh.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTicketResponse", propOrder = {
    "_return"
})
public class GetTicketResponse {

    @XmlElement(name = "return")
    protected MobileBean _return;

    public MobileBean getReturn() {
        return _return;
    }


    public void setReturn(MobileBean value) {
        this._return = value;
    }

}
