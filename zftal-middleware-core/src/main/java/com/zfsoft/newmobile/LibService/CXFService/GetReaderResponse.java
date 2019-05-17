
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReaderResponse", propOrder = {
    "_return"
})
public class GetReaderResponse {

    @XmlElement(name = "return")
    protected Reader _return;


    public Reader getReturn() {
        return _return;
    }

    public void setReturn(Reader value) {
        this._return = value;
    }

}
