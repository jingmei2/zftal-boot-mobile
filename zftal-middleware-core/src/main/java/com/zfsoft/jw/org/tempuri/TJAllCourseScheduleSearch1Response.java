
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tjAllCourseScheduleSearch1Result"
})
@XmlRootElement(name = "TJAllCourseScheduleSearch1Response")
public class TJAllCourseScheduleSearch1Response {

    @XmlElementRef(name = "TJAllCourseScheduleSearch1Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> tjAllCourseScheduleSearch1Result;

    public JAXBElement<String> getTJAllCourseScheduleSearch1Result() {
        return tjAllCourseScheduleSearch1Result;
    }

    public void setTJAllCourseScheduleSearch1Result(JAXBElement<String> value) {
        this.tjAllCourseScheduleSearch1Result = value;
    }

}
