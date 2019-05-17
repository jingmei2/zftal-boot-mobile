
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relegate", propOrder = {
    "relegateDate",
    "relegateEndDate"
})
public class Relegate
    extends PregOrRelegate
{

    protected String relegateDate;
    protected String relegateEndDate;


    public String getRelegateDate() {
        return relegateDate;
    }

    public void setRelegateDate(String value) {
        this.relegateDate = value;
    }

    public String getRelegateEndDate() {
        return relegateEndDate;
    }


    public void setRelegateEndDate(String value) {
        this.relegateEndDate = value;
    }

}
