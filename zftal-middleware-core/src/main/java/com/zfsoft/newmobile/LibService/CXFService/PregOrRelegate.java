
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pregOrRelegate", propOrder = {
    "callNo",
    "certId",
    "dealFlag",
    "dealFlagName",
    "location",
    "name",
    "title"
})
@XmlSeeAlso({
    Relegate.class,
    Preg.class
})
public class PregOrRelegate {

    protected String callNo;
    protected String certId;
    protected String dealFlag;
    protected String dealFlagName;
    protected String location;
    protected String name;
    protected String title;

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String value) {
        this.callNo = value;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String value) {
        this.location = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

}
