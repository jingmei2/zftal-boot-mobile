
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scoreSearchResult"
})
@XmlRootElement(name = "ScoreSearchResponse")
public class ScoreSearchResponse {

    @XmlElementRef(name = "ScoreSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> scoreSearchResult;

    public JAXBElement<String> getScoreSearchResult() {
        return scoreSearchResult;
    }

    public void setScoreSearchResult(JAXBElement<String> value) {
        this.scoreSearchResult = value;
    }

}
