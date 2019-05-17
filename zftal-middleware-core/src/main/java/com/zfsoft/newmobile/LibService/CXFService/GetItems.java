
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItems", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class GetItems {

    protected String arg0;
    protected String arg1;
    protected String arg2;
    protected String arg3;

    /**
     * ��ȡarg0���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * ��ȡarg1���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * ����arg1���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * ��ȡarg2���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * ����arg2���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

    /**
     * ��ȡarg3���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg3() {
        return arg3;
    }

    /**
     * ����arg3���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg3(String value) {
        this.arg3 = value;
    }

}
