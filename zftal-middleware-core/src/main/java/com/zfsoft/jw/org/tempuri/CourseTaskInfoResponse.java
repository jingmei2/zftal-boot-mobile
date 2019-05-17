
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseTaskInfoResult"
})
@XmlRootElement(name = "CourseTaskInfoResponse")
public class CourseTaskInfoResponse {

    @XmlElementRef(name = "CourseTaskInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> courseTaskInfoResult;

    public JAXBElement<String> getCourseTaskInfoResult() {
        return courseTaskInfoResult;
    }

    public void setCourseTaskInfoResult(JAXBElement<String> value) {
        this.courseTaskInfoResult = value;
    }

}
