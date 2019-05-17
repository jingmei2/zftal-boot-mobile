
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "graduationMakeUpExamArrange1Result"
})
@XmlRootElement(name = "GraduationMakeUpExamArrange1Response")
public class GraduationMakeUpExamArrange1Response {

    @XmlElementRef(name = "GraduationMakeUpExamArrange1Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> graduationMakeUpExamArrange1Result;

    public JAXBElement<String> getGraduationMakeUpExamArrange1Result() {
        return graduationMakeUpExamArrange1Result;
    }

    public void setGraduationMakeUpExamArrange1Result(JAXBElement<String> value) {
        this.graduationMakeUpExamArrange1Result = value;
    }

}
