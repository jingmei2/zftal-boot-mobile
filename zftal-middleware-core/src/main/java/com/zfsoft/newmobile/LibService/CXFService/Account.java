
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", propOrder = {
    "amount",
    "billNo",
    "certId",
    "name",
    "paymentFlag",
    "paymentFlagName",
    "paymentItem",
    "paymentItemName",
    "paymentType",
    "paymentTypeName"
})
public class Account {

    protected float amount;
    protected String billNo;
    protected String certId;
    protected String name;
    protected String paymentFlag;
    protected String paymentFlagName;
    protected String paymentItem;
    protected String paymentItemName;
    protected String paymentType;
    protected String paymentTypeName;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float value) {
        this.amount = value;
    }


    public String getBillNo() {
        return billNo;
    }


    public void setBillNo(String value) {
        this.billNo = value;
    }


    public String getCertId() {
        return certId;
    }


    public void setCertId(String value) {
        this.certId = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPaymentFlag() {
        return paymentFlag;
    }


    public void setPaymentFlag(String value) {
        this.paymentFlag = value;
    }

    public String getPaymentFlagName() {
        return paymentFlagName;
    }


    public void setPaymentFlagName(String value) {
        this.paymentFlagName = value;
    }


    public String getPaymentItem() {
        return paymentItem;
    }

    public void setPaymentItem(String value) {
        this.paymentItem = value;
    }

    public String getPaymentItemName() {
        return paymentItemName;
    }

    public void setPaymentItemName(String value) {
        this.paymentItemName = value;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String value) {
        this.paymentTypeName = value;
    }

}
