
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tjAllCourseScheduleSearchResult"
})
@XmlRootElement(name = "TJAllCourseScheduleSearchResponse")
public class TJAllCourseScheduleSearchResponse {

    @XmlElementRef(name = "TJAllCourseScheduleSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> tjAllCourseScheduleSearchResult;

    public JAXBElement<String> getTJAllCourseScheduleSearchResult() {
        return tjAllCourseScheduleSearchResult;
    }

    public void setTJAllCourseScheduleSearchResult(JAXBElement<String> value) {
        this.tjAllCourseScheduleSearchResult = value;
    }

}
