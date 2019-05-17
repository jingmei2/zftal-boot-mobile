
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqData", propOrder = {
    "yhm",
    "yhlx",
    "timestamp",
    "cipher",
    "dataMap"
})
public class ReqData {

    protected String yhm;
    protected String yhlx;
    protected String timestamp;
    protected String cipher;
    protected MapParameter dataMap;

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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String value) {
        this.cipher = value;
    }

    public MapParameter getDataMap() {
        return dataMap;
    }

    public void setDataMap(MapParameter value) {
        this.dataMap = value;
    }

}
