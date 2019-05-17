
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseJxdgTextInfoResult"
})
@XmlRootElement(name = "CourseJxdgTextInfoResponse")
public class CourseJxdgTextInfoResponse {

    @XmlElementRef(name = "CourseJxdgTextInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> courseJxdgTextInfoResult;


    public JAXBElement<String> getCourseJxdgTextInfoResult() {
        return courseJxdgTextInfoResult;
    }


    public void setCourseJxdgTextInfoResult(JAXBElement<String> value) {
        this.courseJxdgTextInfoResult = value;
    }

}
