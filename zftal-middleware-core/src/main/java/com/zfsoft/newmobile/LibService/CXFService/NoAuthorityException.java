
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoAuthorityException", propOrder = {
    "message"
})
public class NoAuthorityException {

    protected String message;


    public String getMessage() {
        return message;
    }


    public void setMessage(String value) {
        this.message = value;
    }

}
