// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Defines the feature for free, automatic upgrades for Gallery Plus.
 * If the field is present, the corresponding feature applies to the category.
 * The field is returned as an empty element (i.e., a boolean value is not returned).
 * 
 */
public class FreeGalleryPlusEnabledDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@AnyElement
	@Order(value=0)
	public List<Object> any;	
	
    
}