
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gradeHasExamArrangeResult"
})
@XmlRootElement(name = "GradeHasExamArrangeResponse")
public class GradeHasExamArrangeResponse {

    @XmlElementRef(name = "GradeHasExamArrangeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> gradeHasExamArrangeResult;

    public JAXBElement<String> getGradeHasExamArrangeResult() {
        return gradeHasExamArrangeResult;
    }

    public void setGradeHasExamArrangeResult(JAXBElement<String> value) {
        this.gradeHasExamArrangeResult = value;
    }

}
