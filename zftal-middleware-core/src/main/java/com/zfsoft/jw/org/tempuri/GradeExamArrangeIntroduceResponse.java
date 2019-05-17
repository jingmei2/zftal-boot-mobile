
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gradeExamArrangeIntroduceResult"
})
@XmlRootElement(name = "GradeExamArrangeIntroduceResponse")
public class GradeExamArrangeIntroduceResponse {

    @XmlElementRef(name = "GradeExamArrangeIntroduceResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> gradeExamArrangeIntroduceResult;

    public JAXBElement<String> getGradeExamArrangeIntroduceResult() {
        return gradeExamArrangeIntroduceResult;
    }

    public void setGradeExamArrangeIntroduceResult(JAXBElement<String> value) {
        this.gradeExamArrangeIntroduceResult = value;
    }

}
