
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reader", propOrder = {
    "beginDate",
    "certFlag",
    "certFlagName",
    "certId",
    "debt",
    "dept",
    "email",
    "endDate",
    "grade",
    "idCard",
    "lendQuantity",
    "limitFlag",
    "limitFlagName",
    "maxLendQuantity",
    "name",
    "readerCertId",
    "readerDept",
    "readerType",
    "registerDay",
    "sex",
    "voltFlag",
    "voltFlagName"
})
public class Reader {

    protected String beginDate;
    protected String certFlag;
    protected String certFlagName;
    protected String certId;
    protected float debt;
    protected String dept;
    protected String email;
    protected String endDate;
    protected String grade;
    protected String idCard;
    protected int lendQuantity;
    protected String limitFlag;
    protected String limitFlagName;
    protected int maxLendQuantity;
    protected String name;
    protected String readerCertId;
    protected String readerDept;
    protected String readerType;
    protected String registerDay;
    protected String sex;
    protected int voltFlag;
    protected String voltFlagName;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    public String getCertFlag() {
        return certFlag;
    }

    public void setCertFlag(String value) {
        this.certFlag = value;
    }

    public String getCertFlagName() {
        return certFlagName;
    }

    public void setCertFlagName(String value) {
        this.certFlagName = value;
    }


    public String getCertId() {
        return certId;
    }


    public void setCertId(String value) {
        this.certId = value;
    }

    public float getDebt() {
        return debt;
    }

    public void setDebt(float value) {
        this.debt = value;
    }

    public String getDept() {
        return dept;
    }


    public void setDept(String value) {
        this.dept = value;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String value) {
        this.email = value;
    }


    public String getEndDate() {
        return endDate;
    }


    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getGrade() {
        return grade;
    }


    public void setGrade(String value) {
        this.grade = value;
    }


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String value) {
        this.idCard = value;
    }

    public int getLendQuantity() {
        return lendQuantity;
    }

    public void setLendQuantity(int value) {
        this.lendQuantity = value;
    }

    public String getLimitFlag() {
        return limitFlag;
    }

    public void setLimitFlag(String value) {
        this.limitFlag = value;
    }

    public String getLimitFlagName() {
        return limitFlagName;
    }

    public void setLimitFlagName(String value) {
        this.limitFlagName = value;
    }

    public int getMaxLendQuantity() {
        return maxLendQuantity;
    }

    public void setMaxLendQuantity(int value) {
        this.maxLendQuantity = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getReaderCertId() {
        return readerCertId;
    }

    public void setReaderCertId(String value) {
        this.readerCertId = value;
    }

    public String getReaderDept() {
        return readerDept;
    }

    public void setReaderDept(String value) {
        this.readerDept = value;
    }

    public String getReaderType() {
        return readerType;
    }

    public void setReaderType(String value) {
        this.readerType = value;
    }

    public String getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(String value) {
        this.registerDay = value;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String value) {
        this.sex = value;
    }

    public int getVoltFlag() {
        return voltFlag;
    }

    public void setVoltFlag(int value) {
        this.voltFlag = value;
    }

    public String getVoltFlagName() {
        return voltFlagName;
    }

    public void setVoltFlagName(String value) {
        this.voltFlagName = value;
    }

}
