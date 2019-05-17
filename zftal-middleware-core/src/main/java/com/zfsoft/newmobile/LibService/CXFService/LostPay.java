
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>lostPay complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="lostPay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookAmt" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="certId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recoupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servFee" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="techFee" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lostPay", propOrder = {
    "barCode",
    "billNo",
    "bookAmt",
    "certId",
    "name",
    "propNo",
    "recoupType",
    "servFee",
    "techFee",
    "title"
})
public class LostPay {

    protected String barCode;
    protected String billNo;
    protected float bookAmt;
    protected String certId;
    protected String name;
    protected String propNo;
    protected String recoupType;
    protected float servFee;
    protected float techFee;
    protected String title;


    public String getBarCode() {
        return barCode;
    }


    public void setBarCode(String value) {
        this.barCode = value;
    }


    public String getBillNo() {
        return billNo;
    }


    public void setBillNo(String value) {
        this.billNo = value;
    }

    public float getBookAmt() {
        return bookAmt;
    }


    public void setBookAmt(float value) {
        this.bookAmt = value;
    }

    public String getCertId() {
        return certId;
    }


    public void setCertId(String value) {
        this.certId = value;
    }


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getPropNo() {
        return propNo;
    }


    public void setPropNo(String value) {
        this.propNo = value;
    }

    public String getRecoupType() {
        return recoupType;
    }

    public void setRecoupType(String value) {
        this.recoupType = value;
    }

    public float getServFee() {
        return servFee;
    }


    public void setServFee(float value) {
        this.servFee = value;
    }

    public float getTechFee() {
        return techFee;
    }

    public void setTechFee(float value) {
        this.techFee = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

}
