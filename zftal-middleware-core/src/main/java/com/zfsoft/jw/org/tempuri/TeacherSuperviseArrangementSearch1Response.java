
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teacherSuperviseArrangementSearch1Result"
})
@XmlRootElement(name = "TeacherSuperviseArrangementSearch1Response")
public class TeacherSuperviseArrangementSearch1Response {

    @XmlElementRef(name = "TeacherSuperviseArrangementSearch1Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> teacherSuperviseArrangementSearch1Result;

    public JAXBElement<String> getTeacherSuperviseArrangementSearch1Result() {
        return teacherSuperviseArrangementSearch1Result;
    }

    public void setTeacherSuperviseArrangementSearch1Result(JAXBElement<String> value) {
        this.teacherSuperviseArrangementSearch1Result = value;
    }

}
