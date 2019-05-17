
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPostTotalRecordsResult"
})
@XmlRootElement(name = "GetPostTotalRecordsResponse")
public class GetPostTotalRecordsResponse {

    @XmlElementRef(name = "GetPostTotalRecordsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getPostTotalRecordsResult;


    public JAXBElement<String> getGetPostTotalRecordsResult() {
        return getPostTotalRecordsResult;
    }


    public void setGetPostTotalRecordsResult(JAXBElement<String> value) {
        this.getPostTotalRecordsResult = value;
    }

}
