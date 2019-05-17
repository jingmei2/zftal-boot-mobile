
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "attachment",
    "barCode",
    "callNo",
    "carrierName",
    "location",
    "locationDept",
    "marcRecNo",
    "price",
    "propNo",
    "state",
    "volPeri",
    "year"
})
public class Item {

    protected String attachment;
    protected String barCode;
    protected String callNo;
    protected String carrierName;
    protected String location;
    protected String locationDept;
    protected String marcRecNo;
    protected float price;
    protected String propNo;
    protected String state;
    protected String volPeri;
    protected String year;

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String value) {
        this.attachment = value;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String value) {
        this.barCode = value;
    }

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String value) {
        this.callNo = value;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String value) {
        this.location = value;
    }

    public String getLocationDept() {
        return locationDept;
    }

    public void setLocationDept(String value) {
        this.locationDept = value;
    }

    public String getMarcRecNo() {
        return marcRecNo;
    }

    public void setMarcRecNo(String value) {
        this.marcRecNo = value;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float value) {
        this.price = value;
    }

    public String getPropNo() {
        return propNo;
    }

    public void setPropNo(String value) {
        this.propNo = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getVolPeri() {
        return volPeri;
    }

    public void setVolPeri(String value) {
        this.volPeri = value;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String value) {
        this.year = value;
    }

}
