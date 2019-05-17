
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
@XmlRootElement(name = "getExamList")
public class GetExamList {

    @XmlElement(required = true, nillable = true)
    protected String in0;
    protected int in1;
    protected int in2;


    public String getIn0() {
        return in0;
    }

    public void setIn0(String value) {
        this.in0 = value;
    }

    public int getIn1() {
        return in1;
    }

    public void setIn1(int value) {
        this.in1 = value;
    }

    public int getIn2() {
        return in2;
    }

    public void setIn2(int value) {
        this.in2 = value;
    }

}
