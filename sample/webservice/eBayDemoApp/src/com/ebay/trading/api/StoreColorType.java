// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Store color set.
 * 
 */
public class StoreColorType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Primary")
	@Order(value=0)
	public String primary;	
	
	@Element(name = "Secondary")
	@Order(value=1)
	public String secondary;	
	
	@Element(name = "Accent")
	@Order(value=2)
	public String accent;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}