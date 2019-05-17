
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getGradeListResult"
})
@XmlRootElement(name = "GetGradeListResponse")
public class GetGradeListResponse {

    @XmlElementRef(name = "GetGradeListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getGradeListResult;

    public JAXBElement<String> getGetGradeListResult() {
        return getGradeListResult;
    }

    public void setGetGradeListResult(JAXBElement<String> value) {
        this.getGradeListResult = value;
    }

}
