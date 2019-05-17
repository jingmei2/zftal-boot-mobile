
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrival", propOrder = {
    "arrivalDate",
    "author",
    "barcode",
    "callNo",
    "certId",
    "keepEndDate",
    "marcRecNo",
    "name",
    "propNo",
    "takeLocation",
    "title"
})
public class Arrival {

    protected String arrivalDate;
    protected String author;
    protected String barcode;
    protected String callNo;
    protected String certId;
    protected String keepEndDate;
    protected String marcRecNo;
    protected String name;
    protected String propNo;
    protected String takeLocation;
    protected String title;

    public String getArrivalDate() {
        return arrivalDate;
    }


    public void setArrivalDate(String value) {
        this.arrivalDate = value;
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

    public String getKeepEndDate() {
        return keepEndDate;
    }

    public void setKeepEndDate(String value) {
        this.keepEndDate = value;
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

    public String getPropNo() {
        return propNo;
    }

    public void setPropNo(String value) {
        this.propNo = value;
    }

    public String getTakeLocation() {
        return takeLocation;
    }

    public void setTakeLocation(String value) {
        this.takeLocation = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

}
