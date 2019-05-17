
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0"
})
@XmlRootElement(name = "deleteMyMemoList")
public class DeleteMyMemoList {

    @XmlElement(required = true, nillable = true)
    protected String in0;

    public String getIn0() {
        return in0;
    }

    public void setIn0(String value) {
        this.in0 = value;
    }

}
