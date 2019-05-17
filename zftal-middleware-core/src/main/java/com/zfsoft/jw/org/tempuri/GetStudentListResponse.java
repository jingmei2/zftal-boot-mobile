
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStudentListResult"
})
@XmlRootElement(name = "GetStudentListResponse")
public class GetStudentListResponse {

    @XmlElementRef(name = "GetStudentListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getStudentListResult;

    public JAXBElement<String> getGetStudentListResult() {
        return getStudentListResult;
    }

    public void setGetStudentListResult(JAXBElement<String> value) {
        this.getStudentListResult = value;
    }

}
