
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTeacherListResult"
})
@XmlRootElement(name = "GetTeacherListResponse")
public class GetTeacherListResponse {

    @XmlElementRef(name = "GetTeacherListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getTeacherListResult;

    public JAXBElement<String> getGetTeacherListResult() {
        return getTeacherListResult;
    }

    public void setGetTeacherListResult(JAXBElement<String> value) {
        this.getTeacherListResult = value;
    }

}
