
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marc", propOrder = {
    "author",
    "callNo",
    "isbn",
    "marcRecNo",
    "pubYear",
    "publisher",
    "title"
})
public class Marc {

    protected String author;
    protected String callNo;
    protected String isbn;
    protected String marcRecNo;
    protected String pubYear;
    protected String publisher;
    protected String title;


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String value) {
        this.author = value;
    }


    public String getCallNo() {
        return callNo;
    }


    public void setCallNo(String value) {
        this.callNo = value;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String value) {
        this.isbn = value;
    }


    public String getMarcRecNo() {
        return marcRecNo;
    }


    public void setMarcRecNo(String value) {
        this.marcRecNo = value;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String value) {
        this.pubYear = value;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String value) {
        this.publisher = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

}
