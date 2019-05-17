
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMajorListResult"
})
@XmlRootElement(name = "GetMajorListResponse")
public class GetMajorListResponse {

    @XmlElementRef(name = "GetMajorListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getMajorListResult;

    public JAXBElement<String> getGetMajorListResult() {
        return getMajorListResult;
    }

    public void setGetMajorListResult(JAXBElement<String> value) {
        this.getMajorListResult = value;
    }

}
