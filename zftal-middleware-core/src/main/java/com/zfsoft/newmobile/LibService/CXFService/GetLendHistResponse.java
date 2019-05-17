
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLendHistResponse", propOrder = {
    "_return"
})
public class GetLendHistResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Circ> _return;


    public List<Circ> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Circ>();
        }
        return this._return;
    }

}
