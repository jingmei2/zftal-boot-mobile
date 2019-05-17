
package com.zfsoft.versionVerify.CXFServe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "versionCompare", propOrder = {
    "imei",
    "imsi",
    "sysinfo",
    "ua",
    "phonum",
    "account",
    "v"
})
public class VersionCompare {

    protected String imei;
    protected String imsi;
    protected String sysinfo;
    protected String ua;
    protected String phonum;
    protected String account;
    protected String v;

    public String getImei() {
        return imei;
    }

    public void setImei(String value) {
        this.imei = value;
    }


    public String getImsi() {
        return imsi;
    }

    public void setImsi(String value) {
        this.imsi = value;
    }

    public String getSysinfo() {
        return sysinfo;
    }

    public void setSysinfo(String value) {
        this.sysinfo = value;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String value) {
        this.ua = value;
    }

    public String getPhonum() {
        return phonum;
    }

    public void setPhonum(String value) {
        this.phonum = value;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String value) {
        this.account = value;
    }

    public String getV() {
        return v;
    }

    public void setV(String value) {
        this.v = value;
    }

}
