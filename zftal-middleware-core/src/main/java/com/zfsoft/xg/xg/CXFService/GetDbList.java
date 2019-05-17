
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDbList", propOrder = {
    "yhm",
    "num",
    "sign"
})
public class GetDbList {

    protected String yhm;
    protected Integer num;
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

    public String getSign() {
        return sign;
    }

    public void setSign(String value) {
        this.sign = value;
    }

}
