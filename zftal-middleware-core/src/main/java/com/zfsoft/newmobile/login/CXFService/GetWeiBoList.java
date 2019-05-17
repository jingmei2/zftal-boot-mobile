
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0",
    "in1"
})
@XmlRootElement(name = "getWeiBoList")
public class GetWeiBoList {

    protected int in0;
    protected int in1;

    public int getIn0() {
        return in0;
    }

    public void setIn0(int value) {
        this.in0 = value;
    }

    public int getIn1() {
        return in1;
    }


    public void setIn1(int value) {
        this.in1 = value;
    }

}
