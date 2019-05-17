
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teacherSuperviseArrangementSearchResult"
})
@XmlRootElement(name = "TeacherSuperviseArrangementSearchResponse")
public class TeacherSuperviseArrangementSearchResponse {

    @XmlElementRef(name = "TeacherSuperviseArrangementSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> teacherSuperviseArrangementSearchResult;

    public JAXBElement<String> getTeacherSuperviseArrangementSearchResult() {
        return teacherSuperviseArrangementSearchResult;
    }

    public void setTeacherSuperviseArrangementSearchResult(JAXBElement<String> value) {
        this.teacherSuperviseArrangementSearchResult = value;
    }

}
