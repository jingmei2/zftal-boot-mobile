
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMajorFieldListResult"
})
@XmlRootElement(name = "GetMajorFieldListResponse")
public class GetMajorFieldListResponse {

    @XmlElementRef(name = "GetMajorFieldListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getMajorFieldListResult;

    public JAXBElement<String> getGetMajorFieldListResult() {
        return getMajorFieldListResult;
    }

    public void setGetMajorFieldListResult(JAXBElement<String> value) {
        this.getMajorFieldListResult = value;
    }

}
