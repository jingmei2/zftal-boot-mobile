
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debt", propOrder = {
    "certId",
    "debtDealFlag",
    "debtDealFlagName",
    "dueFineAmount",
    "fineAmount",
    "lendDate",
    "locationF",
    "name",
    "propNo",
    "retDate"
})
public class Debt {

    protected String certId;
    protected String debtDealFlag;
    protected String debtDealFlagName;
    protected float dueFineAmount;
    protected float fineAmount;
    protected String lendDate;
    protected String locationF;
    protected String name;
    protected String propNo;
    protected String retDate;


    public String getCertId() {
        return certId;
    }

    public void setCertId(String value) {
        this.certId = value;
    }

    public String getDebtDealFlag() {
        return debtDealFlag;
    }

    public void setDebtDealFlag(String value) {
        this.debtDealFlag = value;
    }


    public String getDebtDealFlagName() {
        return debtDealFlagName;
    }

    public void setDebtDealFlagName(String value) {
        this.debtDealFlagName = value;
    }

    public float getDueFineAmount() {
        return dueFineAmount;
    }

    public void setDueFineAmount(float value) {
        this.dueFineAmount = value;
    }

    public float getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(float value) {
        this.fineAmount = value;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String value) {
        this.lendDate = value;
    }

    public String getLocationF() {
        return locationF;
    }

    public void setLocationF(String value) {
        this.locationF = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPropNo() {
        return propNo;
    }

    public void setPropNo(String value) {
        this.propNo = value;
    }

    public String getRetDate() {
        return retDate;
    }

    public void setRetDate(String value) {
        this.retDate = value;
    }

}
