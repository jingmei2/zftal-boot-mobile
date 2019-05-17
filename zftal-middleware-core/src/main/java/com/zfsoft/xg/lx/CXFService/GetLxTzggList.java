
package com.zfsoft.xg.lx.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLxTzggList", propOrder = {
    "yhlx",
    "num",
    "yhm",
    "sign",
    "pageIndex"
})
public class GetLxTzggList {

    protected String yhlx;
    protected Integer num;
    protected String yhm;
    protected String sign;
    protected Integer pageIndex;

    public String getYhlx() {
        return yhlx;
    }

    public void setYhlx(String value) {
        this.yhlx = value;
    }

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

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

}
