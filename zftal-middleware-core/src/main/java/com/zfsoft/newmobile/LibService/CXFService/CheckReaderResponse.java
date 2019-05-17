
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkReaderResponse", propOrder = {
    "_return"
})
public class CheckReaderResponse {

    @XmlElement(name = "return")
    protected CheckRedrResult _return;

    public CheckRedrResult getReturn() {
        return _return;
    }

    public void setReturn(CheckRedrResult value) {
        this._return = value;
    }

}
