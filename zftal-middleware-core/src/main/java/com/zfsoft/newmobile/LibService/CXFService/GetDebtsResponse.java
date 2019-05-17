
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDebtsResponse", propOrder = {
    "_return"
})
public class GetDebtsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Debt> _return;


    public List<Debt> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Debt>();
        }
        return this._return;
    }

}
