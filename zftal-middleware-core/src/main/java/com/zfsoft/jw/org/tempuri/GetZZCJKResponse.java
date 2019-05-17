
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getZZCJKResult"
})
@XmlRootElement(name = "GetZZCJKResponse")
public class GetZZCJKResponse {

    @XmlElementRef(name = "GetZZCJKResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getZZCJKResult;

    public JAXBElement<String> getGetZZCJKResult() {
        return getZZCJKResult;
    }

    public void setGetZZCJKResult(JAXBElement<String> value) {
        this.getZZCJKResult = value;
    }

}
