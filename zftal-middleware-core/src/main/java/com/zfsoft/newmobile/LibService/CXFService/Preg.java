
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preg", propOrder = {
    "pregDate",
    "pregEndDate"
})
public class Preg
    extends PregOrRelegate
{

    protected String pregDate;
    protected String pregEndDate;

    public String getPregDate() {
        return pregDate;
    }

    public void setPregDate(String value) {
        this.pregDate = value;
    }


    public String getPregEndDate() {
        return pregEndDate;
    }


    public void setPregEndDate(String value) {
        this.pregEndDate = value;
    }

}
