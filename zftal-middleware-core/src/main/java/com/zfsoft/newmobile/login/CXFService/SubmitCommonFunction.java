
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0",
    "in1",
    "in2"
})
@XmlRootElement(name = "SubmitCommonFunction")
public class SubmitCommonFunction {

    @XmlElement(required = true, nillable = true)
    protected String in0;
    @XmlElement(required = true, nillable = true)
    protected String in1;
    protected boolean in2;


    public String getIn0() {
        return in0;
    }

    public void setIn0(String value) {
        this.in0 = value;
    }


    public String getIn1() {
        return in1;
    }


    public void setIn1(String value) {
        this.in1 = value;
    }

    public boolean isIn2() {
        return in2;
    }

    public void setIn2(boolean value) {
        this.in2 = value;
    }

}
