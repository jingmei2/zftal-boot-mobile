
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teacherPhotosSearchResult"
})
@XmlRootElement(name = "TeacherPhotosSearchResponse")
public class TeacherPhotosSearchResponse {

    @XmlElementRef(name = "TeacherPhotosSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> teacherPhotosSearchResult;

    public JAXBElement<byte[]> getTeacherPhotosSearchResult() {
        return teacherPhotosSearchResult;
    }

    public void setTeacherPhotosSearchResult(JAXBElement<byte[]> value) {
        this.teacherPhotosSearchResult = value;
    }

}
