
package com.zfsoftzh.xx.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkUserInf", propOrder = {
    "userName",
    "password"
})
public class CheckUserInf {

    protected String userName;
    protected String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String value) {
        this.userName = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

}
