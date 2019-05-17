
package com.zfsoft.backMh.introduce.CXFServe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChildIntroduceTypeListAddPid", propOrder = {
    "id",
    "start",
    "size"
})
public class GetChildIntroduceTypeListAddPid {

    protected String id;
    protected int start;
    protected int size;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
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
