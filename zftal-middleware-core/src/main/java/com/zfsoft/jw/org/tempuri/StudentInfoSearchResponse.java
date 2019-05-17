
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentInfoSearchResult"
})
@XmlRootElement(name = "StudentInfoSearchResponse")
public class StudentInfoSearchResponse {

    @XmlElementRef(name = "StudentInfoSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> studentInfoSearchResult;

    public JAXBElement<String> getStudentInfoSearchResult() {
        return studentInfoSearchResult;
    }

    public void setStudentInfoSearchResult(JAXBElement<String> value) {
        this.studentInfoSearchResult = value;
    }

}
