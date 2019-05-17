
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examArrangeResult"
})
@XmlRootElement(name = "ExamArrangeResponse")
public class ExamArrangeResponse {

    @XmlElementRef(name = "ExamArrangeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> examArrangeResult;

    public JAXBElement<String> getExamArrangeResult() {
        return examArrangeResult;
    }


    public void setExamArrangeResult(JAXBElement<String> value) {
        this.examArrangeResult = value;
    }

}
