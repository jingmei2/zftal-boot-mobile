
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLastNoticeList", propOrder = {
    "yhm",
    "yhlx",
    "type",
    "num",
    "sign",
    "pageIndex"
})
public class GetLastNoticeList {

    protected String yhm;
    protected String yhlx;
    protected String type;
    protected Integer num;
    protected String sign;
    protected Integer pageIndex;


    public String getYhm() {
        return yhm;
    }


    public void setYhm(String value) {
        this.yhm = value;
    }


    public String getYhlx() {
        return yhlx;
    }


    public void setYhlx(String value) {
        this.yhlx = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
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

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

}
