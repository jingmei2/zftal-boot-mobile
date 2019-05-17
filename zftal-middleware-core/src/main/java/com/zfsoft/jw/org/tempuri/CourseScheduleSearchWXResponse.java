
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseScheduleSearchWXResult"
})
@XmlRootElement(name = "CourseScheduleSearch_WXResponse")
public class CourseScheduleSearchWXResponse {

    @XmlElementRef(name = "CourseScheduleSearch_WXResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> courseScheduleSearchWXResult;

    public JAXBElement<String> getCourseScheduleSearchWXResult() {
        return courseScheduleSearchWXResult;
    }

    public void setCourseScheduleSearchWXResult(JAXBElement<String> value) {
        this.courseScheduleSearchWXResult = value;
    }

}
