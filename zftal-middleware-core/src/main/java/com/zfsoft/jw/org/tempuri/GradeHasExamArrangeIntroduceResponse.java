
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gradeHasExamArrangeIntroduceResult"
})
@XmlRootElement(name = "GradeHasExamArrangeIntroduceResponse")
public class GradeHasExamArrangeIntroduceResponse {

    @XmlElementRef(name = "GradeHasExamArrangeIntroduceResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> gradeHasExamArrangeIntroduceResult;

    public JAXBElement<String> getGradeHasExamArrangeIntroduceResult() {
        return gradeHasExamArrangeIntroduceResult;
    }

    public void setGradeHasExamArrangeIntroduceResult(JAXBElement<String> value) {
        this.gradeHasExamArrangeIntroduceResult = value;
    }

}
