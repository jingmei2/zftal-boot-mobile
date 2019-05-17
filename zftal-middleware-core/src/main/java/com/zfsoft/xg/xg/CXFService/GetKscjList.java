
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getKscjList", propOrder = {
    "yhm",
    "num",
    "page",
    "sign"
})
public class GetKscjList {

    protected String yhm;
    protected Integer num;
    @XmlElement(name = "PAGE")
    protected String page;
    protected String sign;

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String value) {
        this.yhm = value;
    }


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer value) {
        this.num = value;
    }

    public String getPAGE() {
        return page;
    }


    public void setPAGE(String value) {
        this.page = value;
    }


    public String getSign() {
        return sign;
    }


    public void setSign(String value) {
        this.sign = value;
    }

}
