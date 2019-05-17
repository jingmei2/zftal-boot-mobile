
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleBean", propOrder = {
    "code",
    "name"
})
public class SimpleBean {

    protected String code;
    protected String name;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }

}
