
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "author",
    "barcode",
    "callNo",
    "locationName",
    "price",
    "propNo",
    "publisher",
    "state",
    "stateName",
    "title"
})
public class Book {

    protected String author;
    protected String barcode;
    protected String callNo;
    protected String locationName;
    protected float price;
    protected String propNo;
    protected String publisher;
    protected String state;
    protected String stateName;
    protected String title;

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


    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String value) {
        this.callNo = value;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String value) {
        this.locationName = value;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String value) {
        this.publisher = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String value) {
        this.stateName = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

}
