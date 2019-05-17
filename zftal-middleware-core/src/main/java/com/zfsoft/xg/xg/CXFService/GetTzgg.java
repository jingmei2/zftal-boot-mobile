
package com.zfsoft.xg.xg.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTzgg", propOrder = {
    "reqData"
})
public class GetTzgg {

    @XmlElement(name = "ReqData")
    protected ReqData reqData;

    public ReqData getReqData() {
        return reqData;
    }

    public void setReqData(ReqData value) {
        this.reqData = value;
    }

}
