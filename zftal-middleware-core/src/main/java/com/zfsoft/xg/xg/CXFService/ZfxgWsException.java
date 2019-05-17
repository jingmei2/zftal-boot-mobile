
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZfxgWsException", propOrder = {
    "message",
    "code"
})
public class ZfxgWsException {

    @XmlElement(required = true, nillable = true)
    protected String message;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }


    public Integer getCode() {
        return code;
    }


    public void setCode(Integer value) {
        this.code = value;
    }

}
