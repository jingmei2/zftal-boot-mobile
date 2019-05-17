
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "count"
})
@XmlRootElement(name = "GetYearTermList")
public class GetYearTermList {

    @XmlElementRef(name = "count", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> count;

    public JAXBElement<String> getCount() {
        return count;
    }

    public void setCount(JAXBElement<String> value) {
        this.count = value;
    }

}
