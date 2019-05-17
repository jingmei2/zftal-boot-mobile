
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configurationInfoResult"
})
@XmlRootElement(name = "ConfigurationInfoResponse")
public class ConfigurationInfoResponse {

    @XmlElementRef(name = "ConfigurationInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> configurationInfoResult;

    public JAXBElement<String> getConfigurationInfoResult() {
        return configurationInfoResult;
    }


    public void setConfigurationInfoResult(JAXBElement<String> value) {
        this.configurationInfoResult = value;
    }

}
