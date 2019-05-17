
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCourseListResult"
})
@XmlRootElement(name = "GetCourseListResponse")
public class GetCourseListResponse {

    @XmlElementRef(name = "GetCourseListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getCourseListResult;

    public JAXBElement<String> getGetCourseListResult() {
        return getCourseListResult;
    }

    public void setGetCourseListResult(JAXBElement<String> value) {
        this.getCourseListResult = value;
    }

}
