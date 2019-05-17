
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subGradeExameInfoResult"
})
@XmlRootElement(name = "SubGradeExameInfoResponse")
public class SubGradeExameInfoResponse {

    @XmlElementRef(name = "SubGradeExameInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> subGradeExameInfoResult;

    public JAXBElement<String> getSubGradeExameInfoResult() {
        return subGradeExameInfoResult;
    }

    public void setSubGradeExameInfoResult(JAXBElement<String> value) {
        this.subGradeExameInfoResult = value;
    }

}
