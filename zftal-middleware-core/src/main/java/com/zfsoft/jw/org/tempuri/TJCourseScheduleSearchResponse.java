
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tjCourseScheduleSearchResult"
})
@XmlRootElement(name = "TJCourseScheduleSearchResponse")
public class TJCourseScheduleSearchResponse {

    @XmlElementRef(name = "TJCourseScheduleSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> tjCourseScheduleSearchResult;

    public JAXBElement<String> getTJCourseScheduleSearchResult() {
        return tjCourseScheduleSearchResult;
    }

    public void setTJCourseScheduleSearchResult(JAXBElement<String> value) {
        this.tjCourseScheduleSearchResult = value;
    }

}
