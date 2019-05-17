
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemException", propOrder = {
    "message"
})
public class SystemException {

    protected String message;


    public String getMessage() {
        return message;
    }


    public void setMessage(String value) {
        this.message = value;
    }

}
