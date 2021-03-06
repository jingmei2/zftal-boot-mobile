
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parameterList",
    "strKey"
})
@XmlRootElement(name = "CourseJxdgInfo")
public class CourseJxdgInfo {

    @XmlElementRef(name = "parameterList", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> parameterList;
    @XmlElementRef(name = "strKey", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> strKey;

    public JAXBElement<String> getParameterList() {
        return parameterList;
    }

    public void setParameterList(JAXBElement<String> value) {
        this.parameterList = value;
    }

    public JAXBElement<String> getStrKey() {
        return strKey;
    }

    public void setStrKey(JAXBElement<String> value) {
        this.strKey = value;
    }

}
