
package com.zfsoft.mh.CXFServe.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobileBean", propOrder = {
    "bm",
    "cacheck",
    "code",
    "dqxn",
    "dqxq",
    "isactive",
    "jhm",
    "jhmtime",
    "jsName",
    "message",
    "sfbdsj",
    "sjradom",
    "sjradomtime",
    "ticket",
    "xm",
    "xtusers",
    "yhm",
    "zjhm"
})
public class MobileBean {

    protected String bm;
    protected boolean cacheck;
    protected String code;
    protected String dqxn;
    protected String dqxq;
    protected String isactive;
    protected String jhm;
    protected String jhmtime;
    protected String jsName;
    protected String message;
    protected String sfbdsj;
    protected String sjradom;
    protected String sjradomtime;
    protected String ticket;
    protected String xm;
    @XmlElement(nillable = true)
    protected List<HashMap> xtusers;
    protected String yhm;
    protected String zjhm;

    public String getBm() {
        return bm;
    }

    public void setBm(String value) {
        this.bm = value;
    }

    public boolean isCacheck() {
        return cacheck;
    }

    public void setCacheck(boolean value) {
        this.cacheck = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }


    public String getDqxn() {
        return dqxn;
    }

    public void setDqxn(String value) {
        this.dqxn = value;
    }


    public String getDqxq() {
        return dqxq;
    }

    public void setDqxq(String value) {
        this.dqxq = value;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String value) {
        this.isactive = value;
    }

    public String getJhm() {
        return jhm;
    }

    public void setJhm(String value) {
        this.jhm = value;
    }

    public String getJhmtime() {
        return jhmtime;
    }

    public void setJhmtime(String value) {
        this.jhmtime = value;
    }

    public String getJsName() {
        return jsName;
    }

    public void setJsName(String value) {
        this.jsName = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public String getSfbdsj() {
        return sfbdsj;
    }

    public void setSfbdsj(String value) {
        this.sfbdsj = value;
    }

    public String getSjradom() {
        return sjradom;
    }


    public void setSjradom(String value) {
        this.sjradom = value;
    }

    public String getSjradomtime() {
        return sjradomtime;
    }


    public void setSjradomtime(String value) {
        this.sjradomtime = value;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String value) {
        this.ticket = value;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String value) {
        this.xm = value;
    }

    /**
     * Gets the value of the xtusers property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtusers property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtusers().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HashMap }
     *
     *
     */
    public List<HashMap> getXtusers() {
        if (xtusers == null) {
            xtusers = new ArrayList<HashMap>();
        }
        return this.xtusers;
    }

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String value) {
        this.yhm = value;
    }


    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String value) {
        this.zjhm = value;
    }

}
