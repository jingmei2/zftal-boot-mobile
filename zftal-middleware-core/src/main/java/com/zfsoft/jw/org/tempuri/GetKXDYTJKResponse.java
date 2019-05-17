
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getKXDYTJKResult"
})
@XmlRootElement(name = "GetKXDYTJKResponse")
public class GetKXDYTJKResponse {

    @XmlElementRef(name = "GetKXDYTJKResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getKXDYTJKResult;


    public JAXBElement<String> getGetKXDYTJKResult() {
        return getKXDYTJKResult;
    }


    public void setGetKXDYTJKResult(JAXBElement<String> value) {
        this.getKXDYTJKResult = value;
    }

}
