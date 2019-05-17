
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scoreInfoSearch2Result"
})
@XmlRootElement(name = "ScoreInfoSearch2Response")
public class ScoreInfoSearch2Response {

    @XmlElementRef(name = "ScoreInfoSearch2Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> scoreInfoSearch2Result;

    public JAXBElement<String> getScoreInfoSearch2Result() {
        return scoreInfoSearch2Result;
    }

    public void setScoreInfoSearch2Result(JAXBElement<String> value) {
        this.scoreInfoSearch2Result = value;
    }

}
