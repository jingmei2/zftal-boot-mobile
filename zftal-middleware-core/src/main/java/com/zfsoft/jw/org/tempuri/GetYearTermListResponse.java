
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getYearTermListResult"
})
@XmlRootElement(name = "GetYearTermListResponse")
public class GetYearTermListResponse {

    @XmlElementRef(name = "GetYearTermListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getYearTermListResult;


    public JAXBElement<String> getGetYearTermListResult() {
        return getYearTermListResult;
    }

    public void setGetYearTermListResult(JAXBElement<String> value) {
        this.getYearTermListResult = value;
    }

}
