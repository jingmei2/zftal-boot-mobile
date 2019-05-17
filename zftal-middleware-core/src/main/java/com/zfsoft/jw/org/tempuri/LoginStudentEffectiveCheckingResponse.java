
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginStudentEffectiveCheckingResult"
})
@XmlRootElement(name = "LoginStudentEffectiveCheckingResponse")
public class LoginStudentEffectiveCheckingResponse {

    @XmlElementRef(name = "LoginStudentEffectiveCheckingResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> loginStudentEffectiveCheckingResult;

    public JAXBElement<String> getLoginStudentEffectiveCheckingResult() {
        return loginStudentEffectiveCheckingResult;
    }

    public void setLoginStudentEffectiveCheckingResult(JAXBElement<String> value) {
        this.loginStudentEffectiveCheckingResult = value;
    }

}
