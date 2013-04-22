// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns the ID of a user who has gone through an application's consent flow
 * process for obtaining an authorization token.
 * 
 */
@RootElement(name = "ConfirmIdentityRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ConfirmIdentityRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SessionID")
	@Order(value=0)
	public String sessionID;	
	
    
}