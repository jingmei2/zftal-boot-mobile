
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentRewardSearchResult"
})
@XmlRootElement(name = "StudentRewardSearchResponse")
public class StudentRewardSearchResponse {

    @XmlElementRef(name = "StudentRewardSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> studentRewardSearchResult;

    public JAXBElement<String> getStudentRewardSearchResult() {
        return studentRewardSearchResult;
    }

    public void setStudentRewardSearchResult(JAXBElement<String> value) {
        this.studentRewardSearchResult = value;
    }

}
