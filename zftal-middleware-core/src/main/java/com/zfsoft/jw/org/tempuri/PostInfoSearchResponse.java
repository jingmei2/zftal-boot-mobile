
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "postInfoSearchResult"
})
@XmlRootElement(name = "PostInfoSearchResponse")
public class PostInfoSearchResponse {

    @XmlElementRef(name = "PostInfoSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> postInfoSearchResult;

    public JAXBElement<String> getPostInfoSearchResult() {
        return postInfoSearchResult;
    }

    public void setPostInfoSearchResult(JAXBElement<String> value) {
        this.postInfoSearchResult = value;
    }

}
