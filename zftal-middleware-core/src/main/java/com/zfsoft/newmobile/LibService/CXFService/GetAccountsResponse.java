
package com.zfsoft.newmobile.LibService.CXFService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountsResponse", propOrder = {
    "_return"
})
public class GetAccountsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Account> _return;

    public List<Account> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Account>();
        }
        return this._return;
    }

}
