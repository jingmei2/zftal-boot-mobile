
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getViolationsResponse", propOrder = {
    "_return"
})
public class GetViolationsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Violation> _return;


    public List<Violation> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Violation>();
        }
        return this._return;
    }

}
