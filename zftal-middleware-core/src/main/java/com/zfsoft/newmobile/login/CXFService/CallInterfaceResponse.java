
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "out"
})
@XmlRootElement(name = "callInterfaceResponse")
public class CallInterfaceResponse {

    @XmlElement(required = true, nillable = true)
    protected String out;

    public String getOut() {
        return out;
    }


    public void setOut(String value) {
        this.out = value;
    }

}
