
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDbCount", propOrder = {
    "yhm",
    "sign"
})
public class GetDbCount {

    protected String yhm;
    protected String sign;


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
