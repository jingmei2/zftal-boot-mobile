
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gradeExamArrangeResult"
})
@XmlRootElement(name = "GradeExamArrangeResponse")
public class GradeExamArrangeResponse {

    @XmlElementRef(name = "GradeExamArrangeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> gradeExamArrangeResult;

    public JAXBElement<String> getGradeExamArrangeResult() {
        return gradeExamArrangeResult;
    }

    public void setGradeExamArrangeResult(JAXBElement<String> value) {
        this.gradeExamArrangeResult = value;
    }

}
