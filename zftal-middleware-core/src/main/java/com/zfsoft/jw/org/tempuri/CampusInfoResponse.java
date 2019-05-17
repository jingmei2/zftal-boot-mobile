
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campusInfoResult"
})
@XmlRootElement(name = "CampusInfoResponse")
public class CampusInfoResponse {

    @XmlElementRef(name = "CampusInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> campusInfoResult;


    public JAXBElement<String> getCampusInfoResult() {
        return campusInfoResult;
    }

    public void setCampusInfoResult(JAXBElement<String> value) {
        this.campusInfoResult = value;
    }

}
