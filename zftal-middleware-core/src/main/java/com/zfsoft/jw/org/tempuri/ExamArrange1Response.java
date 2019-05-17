
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examArrange1Result"
})
@XmlRootElement(name = "ExamArrange1Response")
public class ExamArrange1Response {

    @XmlElementRef(name = "ExamArrange1Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> examArrange1Result;

    public JAXBElement<String> getExamArrange1Result() {
        return examArrange1Result;
    }

    public void setExamArrange1Result(JAXBElement<String> value) {
        this.examArrange1Result = value;
    }

}
