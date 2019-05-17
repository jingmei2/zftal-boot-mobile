
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkNoPjNologinResult"
})
@XmlRootElement(name = "CheckNoPjNologinResponse")
public class CheckNoPjNologinResponse {

    @XmlElementRef(name = "CheckNoPjNologinResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> checkNoPjNologinResult;

    public JAXBElement<String> getCheckNoPjNologinResult() {
        return checkNoPjNologinResult;
    }

    public void setCheckNoPjNologinResult(JAXBElement<String> value) {
        this.checkNoPjNologinResult = value;
    }

}
