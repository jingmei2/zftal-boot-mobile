
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teachingSiteIdleInfoResult"
})
@XmlRootElement(name = "TeachingSiteIdleInfoResponse")
public class TeachingSiteIdleInfoResponse {

    @XmlElementRef(name = "TeachingSiteIdleInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> teachingSiteIdleInfoResult;

    public JAXBElement<String> getTeachingSiteIdleInfoResult() {
        return teachingSiteIdleInfoResult;
    }

    public void setTeachingSiteIdleInfoResult(JAXBElement<String> value) {
        this.teachingSiteIdleInfoResult = value;
    }

}
