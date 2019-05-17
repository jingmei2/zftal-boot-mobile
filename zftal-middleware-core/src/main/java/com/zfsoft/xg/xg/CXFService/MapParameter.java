
package com.zfsoft.xg.xg.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapParameter", propOrder = {
    "entry"
})
public class MapParameter {

    @XmlElement(nillable = true)
    protected List<MapParameterEntry> entry;

    public List<MapParameterEntry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<MapParameterEntry>();
        }
        return this.entry;
    }

}
