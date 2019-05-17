
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMarcResponse", propOrder = {
    "_return"
})
public class GetMarcResponse {

    @XmlElement(name = "return")
    protected Marc _return;

    public Marc getReturn() {
        return _return;
    }

    public void setReturn(Marc value) {
        this._return = value;
    }

}
