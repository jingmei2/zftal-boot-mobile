
package com.zfsoft.backMh.news.CXFService.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTypeIdNewsPageListNew", propOrder = {
    "tid",
    "start",
    "size"
})
public class GetTypeIdNewsPageListNew {

    protected String tid;
    protected int start;
    protected int size;

    public String getTid() {
        return tid;
    }

    public void setTid(String value) {
        this.tid = value;
    }

    public int getStart() {
        return start;
    }


    public void setStart(int value) {
        this.start = value;
    }

    public int getSize() {
        return size;
    }


    public void setSize(int value) {
        this.size = value;
    }

}
