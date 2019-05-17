
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBookResponse", propOrder = {
    "_return"
})
public class GetBookResponse {

    @XmlElement(name = "return")
    protected Book _return;


    public Book getReturn() {
        return _return;
    }

    public void setReturn(Book value) {
        this._return = value;
    }

}
