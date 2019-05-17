
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classRoomCategoryInfoResult"
})
@XmlRootElement(name = "ClassRoomCategoryInfoResponse")
public class ClassRoomCategoryInfoResponse {

    @XmlElementRef(name = "ClassRoomCategoryInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> classRoomCategoryInfoResult;


    public JAXBElement<String> getClassRoomCategoryInfoResult() {
        return classRoomCategoryInfoResult;
    }

    public void setClassRoomCategoryInfoResult(JAXBElement<String> value) {
        this.classRoomCategoryInfoResult = value;
    }

}
