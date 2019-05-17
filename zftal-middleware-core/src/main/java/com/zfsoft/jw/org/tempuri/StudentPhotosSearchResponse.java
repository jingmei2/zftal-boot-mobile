
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentPhotosSearchResult"
})
@XmlRootElement(name = "StudentPhotosSearchResponse")
public class StudentPhotosSearchResponse {

    @XmlElementRef(name = "StudentPhotosSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> studentPhotosSearchResult;

    public JAXBElement<byte[]> getStudentPhotosSearchResult() {
        return studentPhotosSearchResult;
    }

    public void setStudentPhotosSearchResult(JAXBElement<byte[]> value) {
        this.studentPhotosSearchResult = value;
    }

}
