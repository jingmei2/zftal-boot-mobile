
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getZxsxxResponse", propOrder = {
    "_return"
})
public class GetZxsxxResponse {

    @XmlElement(name = "return")
    protected String _return;


    public String getReturn() {
        return _return;
    }


    public void setReturn(String value) {
        this._return = value;
    }

}
