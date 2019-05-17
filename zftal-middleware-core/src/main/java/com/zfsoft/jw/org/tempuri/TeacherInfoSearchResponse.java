
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teacherInfoSearchResult"
})
@XmlRootElement(name = "TeacherInfoSearchResponse")
public class TeacherInfoSearchResponse {

    @XmlElementRef(name = "TeacherInfoSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> teacherInfoSearchResult;

    public JAXBElement<String> getTeacherInfoSearchResult() {
        return teacherInfoSearchResult;
    }

    public void setTeacherInfoSearchResult(JAXBElement<String> value) {
        this.teacherInfoSearchResult = value;
    }

}
