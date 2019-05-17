
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDepsResponse", propOrder = {
    "_return"
})
public class GetDepsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<SimpleBean> _return;

    public List<SimpleBean> getReturn() {
        if (_return == null) {
            _return = new ArrayList<SimpleBean>();
        }
        return this._return;
    }

}
