
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPostListResult"
})
@XmlRootElement(name = "GetPostListResponse")
public class GetPostListResponse {

    @XmlElementRef(name = "GetPostListResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> getPostListResult;

    public JAXBElement<String> getGetPostListResult() {
        return getPostListResult;
    }

    public void setGetPostListResult(JAXBElement<String> value) {
        this.getPostListResult = value;
    }

}
