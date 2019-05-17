
package com.zfsoft.newmobile.login.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0"
})
@XmlRootElement(name = "getMhRecommendPage")
public class GetMhRecommendPage {

    protected int in0;

    public int getIn0() {
        return in0;
    }

    public void setIn0(int value) {
        this.in0 = value;
    }

}
