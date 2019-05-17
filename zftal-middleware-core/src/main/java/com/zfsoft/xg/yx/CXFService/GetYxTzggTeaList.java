
package com.zfsoft.xg.yx.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getYxTzggTeaList", propOrder = {
    "num",
    "yhm",
    "sign"
})
public class GetYxTzggTeaList {

    protected Integer num;
    protected String yhm;
    protected String sign;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer value) {
        this.num = value;
    }

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String value) {
        this.yhm = value;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String value) {
        this.sign = value;
    }

}
