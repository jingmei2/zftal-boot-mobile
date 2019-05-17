
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "starttime",
    "endtime"
})
@XmlRootElement(name = "CourseScheduleSearch_WX")
public class CourseScheduleSearchWX {

    @XmlElementRef(name = "username", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "starttime", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> starttime;
    @XmlElementRef(name = "endtime", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> endtime;

    public JAXBElement<String> getUsername() {
        return username;
    }

    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

    public JAXBElement<String> getStarttime() {
        return starttime;
    }

    public void setStarttime(JAXBElement<String> value) {
        this.starttime = value;
    }

    public JAXBElement<String> getEndtime() {
        return endtime;
    }

    public void setEndtime(JAXBElement<String> value) {
        this.endtime = value;
    }

}
