
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circ", propOrder = {
    "attachment",
    "author",
    "barcode",
    "certId",
    "dueDay",
    "lendDate",
    "location",
    "marcRecNo",
    "name",
    "price",
    "propNo",
    "renewTimes",
    "title"
})
public class Circ {

    protected String attachment;
    protected String author;
    protected String barcode;
    protected String certId;
    protected String dueDay;
    protected String lendDate;
    protected String location;
    protected String marcRecNo;
    protected String name;
    protected float price;
    protected String propNo;
    protected int renewTimes;
    protected String title;

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String value) {
        this.attachment = value;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String value) {
        this.author = value;
    }

    public String getBarcode() {
        return barcode;
    }


    public void setBarcode(String value) {
        this.barcode = value;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String value) {
        this.certId = value;
    }

    public String getDueDay() {
        return dueDay;
    }

    public void setDueDay(String value) {
        this.dueDay = value;
    }


    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String value) {
        this.lendDate = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String value) {
        this.location = value;
    }

    public String getMarcRecNo() {
        return marcRecNo;
    }

    public void setMarcRecNo(String value) {
        this.marcRecNo = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
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

    public int getRenewTimes() {
        return renewTimes;
    }

    public void setRenewTimes(int value) {
        this.renewTimes = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

}
