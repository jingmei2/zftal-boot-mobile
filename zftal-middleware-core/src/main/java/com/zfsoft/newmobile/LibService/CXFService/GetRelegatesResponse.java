
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRelegatesResponse", propOrder = {
    "_return"
})
public class GetRelegatesResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Relegate> _return;

    public List<Relegate> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Relegate>();
        }
        return this._return;
    }

}
