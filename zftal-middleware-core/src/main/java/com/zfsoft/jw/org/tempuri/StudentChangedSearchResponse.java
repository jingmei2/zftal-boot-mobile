
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentChangedSearchResult"
})
@XmlRootElement(name = "StudentChangedSearchResponse")
public class StudentChangedSearchResponse {

    @XmlElementRef(name = "StudentChangedSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> studentChangedSearchResult;

    public JAXBElement<String> getStudentChangedSearchResult() {
        return studentChangedSearchResult;
    }


    public void setStudentChangedSearchResult(JAXBElement<String> value) {
        this.studentChangedSearchResult = value;
    }

}
