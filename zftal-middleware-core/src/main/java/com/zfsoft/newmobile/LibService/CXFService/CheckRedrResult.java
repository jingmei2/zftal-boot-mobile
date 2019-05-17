
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkRedrResult", propOrder = {
    "code",
    "reader"
})
public class CheckRedrResult {

    protected int code;
    protected Reader reader;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        this.code = value;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader value) {
        this.reader = value;
    }

}
