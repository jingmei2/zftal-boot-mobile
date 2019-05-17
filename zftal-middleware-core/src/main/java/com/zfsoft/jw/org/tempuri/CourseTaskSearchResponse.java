
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseTaskSearchResult"
})
@XmlRootElement(name = "CourseTaskSearchResponse")
public class CourseTaskSearchResponse {

    @XmlElementRef(name = "CourseTaskSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> courseTaskSearchResult;

    public JAXBElement<String> getCourseTaskSearchResult() {
        return courseTaskSearchResult;
    }

    public void setCourseTaskSearchResult(JAXBElement<String> value) {
        this.courseTaskSearchResult = value;
    }

}
