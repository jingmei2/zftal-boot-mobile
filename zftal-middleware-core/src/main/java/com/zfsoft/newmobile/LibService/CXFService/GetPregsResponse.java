
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPregsResponse", propOrder = {
    "_return"
})
public class GetPregsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Preg> _return;

    public List<Preg> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Preg>();
        }
        return this._return;
    }

}
