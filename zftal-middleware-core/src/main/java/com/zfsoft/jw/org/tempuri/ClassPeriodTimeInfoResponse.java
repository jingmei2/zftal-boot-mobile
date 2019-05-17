
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classPeriodTimeInfoResult"
})
@XmlRootElement(name = "ClassPeriodTimeInfoResponse")
public class ClassPeriodTimeInfoResponse {

    @XmlElementRef(name = "ClassPeriodTimeInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> classPeriodTimeInfoResult;


    public JAXBElement<String> getClassPeriodTimeInfoResult() {
        return classPeriodTimeInfoResult;
    }


    public void setClassPeriodTimeInfoResult(JAXBElement<String> value) {
        this.classPeriodTimeInfoResult = value;
    }

}
