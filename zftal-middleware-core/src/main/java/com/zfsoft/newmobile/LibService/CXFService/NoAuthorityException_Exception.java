
package com.zfsoft.newmobile.LibService.CXFService;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.0
 * 2016-06-13T18:55:21.345+08:00
 * Generated source version: 2.6.0
 */

@WebFault(name = "NoAuthorityException", targetNamespace = "http://service.ws.hw.com/")
public class NoAuthorityException_Exception extends Exception {

    private com.zfsoft.newmobile.LibService.CXFService.NoAuthorityException noAuthorityException;

    public NoAuthorityException_Exception() {
        super();
    }

    public NoAuthorityException_Exception(String message) {
        super(message);
    }

    public NoAuthorityException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public NoAuthorityException_Exception(String message, com.zfsoft.newmobile.LibService.CXFService.NoAuthorityException noAuthorityException) {
        super(message);
        this.noAuthorityException = noAuthorityException;
    }

    public NoAuthorityException_Exception(String message, com.zfsoft.newmobile.LibService.CXFService.NoAuthorityException noAuthorityException, Throwable cause) {
        super(message, cause);
        this.noAuthorityException = noAuthorityException;
    }

    public com.zfsoft.newmobile.LibService.CXFService.NoAuthorityException getFaultInfo() {
        return this.noAuthorityException;
    }
}
