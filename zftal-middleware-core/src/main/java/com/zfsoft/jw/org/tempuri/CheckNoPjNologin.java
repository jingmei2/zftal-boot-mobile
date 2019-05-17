
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strXH"
})
@XmlRootElement(name = "CheckNoPjNologin")
public class CheckNoPjNologin {

    @XmlElementRef(name = "strXH", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> strXH;


    public JAXBElement<String> getStrXH() {
        return strXH;
    }


    public void setStrXH(JAXBElement<String> value) {
        this.strXH = value;
    }

}
