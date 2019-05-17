
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitSuggestion", propOrder = {
    "userName",
    "suggestion",
    "strKey"
})
public class SubmitSuggestion {

    protected String userName;
    protected String suggestion;
    protected String strKey;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String value) {
        this.userName = value;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String value) {
        this.suggestion = value;
    }

    public String getStrKey() {
        return strKey;
    }

    public void setStrKey(String value) {
        this.strKey = value;
    }

}
