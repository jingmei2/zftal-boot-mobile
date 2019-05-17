
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "graduationMakeUpExamArrangeResult"
})
@XmlRootElement(name = "GraduationMakeUpExamArrangeResponse")
public class GraduationMakeUpExamArrangeResponse {

    @XmlElementRef(name = "GraduationMakeUpExamArrangeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> graduationMakeUpExamArrangeResult;

    public JAXBElement<String> getGraduationMakeUpExamArrangeResult() {
        return graduationMakeUpExamArrangeResult;
    }

    public void setGraduationMakeUpExamArrangeResult(JAXBElement<String> value) {
        this.graduationMakeUpExamArrangeResult = value;
    }

}
