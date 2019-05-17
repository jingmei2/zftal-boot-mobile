
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentPunishmentSearchResult"
})
@XmlRootElement(name = "StudentPunishmentSearchResponse")
public class StudentPunishmentSearchResponse {

    @XmlElementRef(name = "StudentPunishmentSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> studentPunishmentSearchResult;


    public JAXBElement<String> getStudentPunishmentSearchResult() {
        return studentPunishmentSearchResult;
    }


    public void setStudentPunishmentSearchResult(JAXBElement<String> value) {
        this.studentPunishmentSearchResult = value;
    }

}
