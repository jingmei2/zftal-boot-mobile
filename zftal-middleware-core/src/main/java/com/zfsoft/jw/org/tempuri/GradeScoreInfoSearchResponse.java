
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gradeScoreInfoSearchResult"
})
@XmlRootElement(name = "GradeScoreInfoSearchResponse")
public class GradeScoreInfoSearchResponse {

    @XmlElementRef(name = "GradeScoreInfoSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> gradeScoreInfoSearchResult;

    public JAXBElement<String> getGradeScoreInfoSearchResult() {
        return gradeScoreInfoSearchResult;
    }

    public void setGradeScoreInfoSearchResult(JAXBElement<String> value) {
        this.gradeScoreInfoSearchResult = value;
    }

}
