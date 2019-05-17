
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scoreInfoSearchResult"
})
@XmlRootElement(name = "ScoreInfoSearchResponse")
public class ScoreInfoSearchResponse {

    @XmlElementRef(name = "ScoreInfoSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> scoreInfoSearchResult;

    public JAXBElement<String> getScoreInfoSearchResult() {
        return scoreInfoSearchResult;
    }

    public void setScoreInfoSearchResult(JAXBElement<String> value) {
        this.scoreInfoSearchResult = value;
    }

}
