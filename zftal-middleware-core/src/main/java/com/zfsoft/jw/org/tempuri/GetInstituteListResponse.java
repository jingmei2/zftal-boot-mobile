
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getInstituteListResult"
})
@XmlRootElement(name = "GetInstituteListResponse")
public class GetInstituteListResponse {

    @XmlElementRef(name = "GetInstituteListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getInstituteListResult;


    public JAXBElement<String> getGetInstituteListResult() {
        return getInstituteListResult;
    }


    public void setGetInstituteListResult(JAXBElement<String> value) {
        this.getInstituteListResult = value;
    }

}
