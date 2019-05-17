
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseJxdgInfoResult"
})
@XmlRootElement(name = "CourseJxdgInfoResponse")
public class CourseJxdgInfoResponse {

    @XmlElementRef(name = "CourseJxdgInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> courseJxdgInfoResult;


    public JAXBElement<String> getCourseJxdgInfoResult() {
        return courseJxdgInfoResult;
    }


    public void setCourseJxdgInfoResult(JAXBElement<String> value) {
        this.courseJxdgInfoResult = value;
    }

}
