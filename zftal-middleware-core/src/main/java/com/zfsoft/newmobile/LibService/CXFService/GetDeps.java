
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeps", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class GetDeps {

    protected String arg0;
    protected String arg1;
    protected String arg2;

    public String getArg0() {
        return arg0;
    }

    public void setArg0(String value) {
        this.arg0 = value;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String value) {
        this.arg1 = value;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String value) {
        this.arg2 = value;
    }

}
