
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
    "in2",
    "in3"
})
@XmlRootElement(name = "getNoticeList")
public class GetNoticeList {

    @XmlElement(required = true, nillable = true)
    protected String in0;
    @XmlElement(required = true, nillable = true)
    protected String in1;
    @XmlElement(required = true, nillable = true)
    protected String in2;
    @XmlElement(required = true, nillable = true)
    protected String in3;

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


    public String getIn2() {
        return in2;
    }

    public void setIn2(String value) {
        this.in2 = value;
    }


    public String getIn3() {
        return in3;
    }


    public void setIn3(String value) {
        this.in3 = value;
    }

}
