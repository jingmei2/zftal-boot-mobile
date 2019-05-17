
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPregArrivalsResponse", propOrder = {
    "_return"
})
public class GetPregArrivalsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Arrival> _return;


    public List<Arrival> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Arrival>();
        }
        return this._return;
    }

}
