
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseScheduleSearchResult"
})
@XmlRootElement(name = "CourseScheduleSearchResponse")
public class CourseScheduleSearchResponse {

    @XmlElementRef(name = "CourseScheduleSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> courseScheduleSearchResult;

    public JAXBElement<String> getCourseScheduleSearchResult() {
        return courseScheduleSearchResult;
    }

    public void setCourseScheduleSearchResult(JAXBElement<String> value) {
        this.courseScheduleSearchResult = value;
    }

}
