
package com.zfsoft.jw.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parameterList",
    "count",
    "strKey"
})
@XmlRootElement(name = "StudentPunishmentSearch")
public class StudentPunishmentSearch {

    @XmlElementRef(name = "parameterList", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> parameterList;
    @XmlElementRef(name = "count", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> count;
    @XmlElementRef(name = "strKey", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> strKey;


    public JAXBElement<String> getParameterList() {
        return parameterList;
    }


    public void setParameterList(JAXBElement<String> value) {
        this.parameterList = value;
    }


    public JAXBElement<String> getCount() {
        return count;
    }


    public void setCount(JAXBElement<String> value) {
        this.count = value;
    }


    public JAXBElement<String> getStrKey() {
        return strKey;
    }


    public void setStrKey(JAXBElement<String> value) {
        this.strKey = value;
    }

}
