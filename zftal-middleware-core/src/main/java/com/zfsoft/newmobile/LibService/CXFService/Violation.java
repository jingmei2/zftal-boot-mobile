
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "violation", propOrder = {
    "certId",
    "dealFlag",
    "dealFlagName",
    "fineAmount",
    "frozEndDate",
    "name",
    "pulishDate",
    "voltName"
})
public class Violation {

    protected String certId;
    protected String dealFlag;
    protected String dealFlagName;
    protected float fineAmount;
    protected String frozEndDate;
    protected String name;
    protected String pulishDate;
    protected String voltName;


    public String getCertId() {
        return certId;
    }

    public void setCertId(String value) {
        this.certId = value;
    }


    public String getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(String value) {
        this.dealFlag = value;
    }

    public String getDealFlagName() {
        return dealFlagName;
    }


    public void setDealFlagName(String value) {
        this.dealFlagName = value;
    }

    public float getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(float value) {
        this.fineAmount = value;
    }

    public String getFrozEndDate() {
        return frozEndDate;
    }

    public void setFrozEndDate(String value) {
        this.frozEndDate = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPulishDate() {
        return pulishDate;
    }

    public void setPulishDate(String value) {
        this.pulishDate = value;
    }

    public String getVoltName() {
        return voltName;
    }

    public void setVoltName(String value) {
        this.voltName = value;
    }

}
