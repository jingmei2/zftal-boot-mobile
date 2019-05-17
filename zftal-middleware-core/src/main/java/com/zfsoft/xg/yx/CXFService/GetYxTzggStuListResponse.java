
package com.zfsoft.xg.yx.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getYxTzggStuListResponse", propOrder = {
    "_return"
})
public class GetYxTzggStuListResponse {

    @XmlElement(name = "return")
    protected String _return;

    public String getReturn() {
        return _return;
    }

    public void setReturn(String value) {
        this._return = value;
    }

}
