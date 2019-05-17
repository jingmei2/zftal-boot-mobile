
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginNoJsCheckResult"
})
@XmlRootElement(name = "LoginNoJsCheckResponse")
public class LoginNoJsCheckResponse {

    @XmlElementRef(name = "LoginNoJsCheckResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> loginNoJsCheckResult;

    public JAXBElement<String> getLoginNoJsCheckResult() {
        return loginNoJsCheckResult;
    }

    public void setLoginNoJsCheckResult(JAXBElement<String> value) {
        this.loginNoJsCheckResult = value;
    }

}
