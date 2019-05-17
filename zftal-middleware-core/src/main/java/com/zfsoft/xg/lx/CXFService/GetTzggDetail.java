
package com.zfsoft.xg.lx.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTzggDetail", propOrder = {
    "id",
    "yhm",
    "sign"
})
public class GetTzggDetail {

    protected String id;
    protected String yhm;
    protected String sign;


    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
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
