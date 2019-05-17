
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teachingSiteInfoResult"
})
@XmlRootElement(name = "TeachingSiteInfoResponse")
public class TeachingSiteInfoResponse {

    @XmlElementRef(name = "TeachingSiteInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> teachingSiteInfoResult;

    public JAXBElement<String> getTeachingSiteInfoResult() {
        return teachingSiteInfoResult;
    }

    public void setTeachingSiteInfoResult(JAXBElement<String> value) {
        this.teachingSiteInfoResult = value;
    }

}
