
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCourseList1Result"
})
@XmlRootElement(name = "GetCourseList1Response")
public class GetCourseList1Response {

    @XmlElementRef(name = "GetCourseList1Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getCourseList1Result;

    public JAXBElement<String> getGetCourseList1Result() {
        return getCourseList1Result;
    }

    public void setGetCourseList1Result(JAXBElement<String> value) {
        this.getCourseList1Result = value;
    }

}
