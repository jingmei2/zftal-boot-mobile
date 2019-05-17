
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "makeUpExamArrange1Result"
})
@XmlRootElement(name = "MakeUpExamArrange1Response")
public class MakeUpExamArrange1Response {

    @XmlElementRef(name = "MakeUpExamArrange1Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> makeUpExamArrange1Result;

    public JAXBElement<String> getMakeUpExamArrange1Result() {
        return makeUpExamArrange1Result;
    }

    public void setMakeUpExamArrange1Result(JAXBElement<String> value) {
        this.makeUpExamArrange1Result = value;
    }

}
