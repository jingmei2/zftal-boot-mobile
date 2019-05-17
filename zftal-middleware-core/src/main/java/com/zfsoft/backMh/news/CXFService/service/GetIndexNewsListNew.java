
package com.zfsoft.backMh.news.CXFService.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIndexNewsListNew", propOrder = {
    "start",
    "size"
})
public class GetIndexNewsListNew {

    protected int start;
    protected int size;

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
