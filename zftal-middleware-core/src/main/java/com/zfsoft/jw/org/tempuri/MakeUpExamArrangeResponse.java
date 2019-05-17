
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "makeUpExamArrangeResult"
})
@XmlRootElement(name = "MakeUpExamArrangeResponse")
public class MakeUpExamArrangeResponse {

    @XmlElementRef(name = "MakeUpExamArrangeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> makeUpExamArrangeResult;

    public JAXBElement<String> getMakeUpExamArrangeResult() {
        return makeUpExamArrangeResult;
    }

    public void setMakeUpExamArrangeResult(JAXBElement<String> value) {
        this.makeUpExamArrangeResult = value;
    }

}
