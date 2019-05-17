
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getClassListResult"
})
@XmlRootElement(name = "GetClassListResponse")
public class GetClassListResponse {

    @XmlElementRef(name = "GetClassListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getClassListResult;

    public JAXBElement<String> getGetClassListResult() {
        return getClassListResult;
    }

    public void setGetClassListResult(JAXBElement<String> value) {
        this.getClassListResult = value;
    }

}
