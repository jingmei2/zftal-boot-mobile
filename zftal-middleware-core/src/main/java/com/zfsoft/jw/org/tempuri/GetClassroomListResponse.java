
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getClassroomListResult"
})
@XmlRootElement(name = "GetClassroomListResponse")
public class GetClassroomListResponse {

    @XmlElementRef(name = "GetClassroomListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getClassroomListResult;


    public JAXBElement<String> getGetClassroomListResult() {
        return getClassroomListResult;
    }

    public void setGetClassroomListResult(JAXBElement<String> value) {
        this.getClassroomListResult = value;
    }

}
