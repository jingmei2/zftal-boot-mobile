
package com.zfsoft.mobile.services.assetWebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="yhm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noticeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "yhm",
        "noticeType",
        "num",
        "sign"
})
@XmlRootElement(name = "getLastNoticeList")
public class GetLastNoticeList {

    protected String yhm;
    protected String noticeType;
    protected int num;
    protected String sign;

    /**
     * 获取yhm属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYhm() {
        return yhm;
    }

    /**
     * 设置yhm属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYhm(String value) {
        this.yhm = value;
    }

    /**
     * 获取noticeType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * 设置noticeType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoticeType(String value) {
        this.noticeType = value;
    }

    /**
     * 获取num属性的值。
     *
     */
    public int getNum() {
        return num;
    }

    /**
     * 设置num属性的值。
     *
     */
    public void setNum(int value) {
        this.num = value;
    }

    /**
     * 获取sign属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置sign属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSign(String value) {
        this.sign = value;
    }

}
