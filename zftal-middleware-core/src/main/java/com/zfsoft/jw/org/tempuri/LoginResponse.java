
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginResult"
})
@XmlRootElement(name = "LoginResponse")
public class LoginResponse {

    @XmlElementRef(name = "LoginResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> loginResult;

    public JAXBElement<String> getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(JAXBElement<String> value) {
        this.loginResult = value;
    }

}
