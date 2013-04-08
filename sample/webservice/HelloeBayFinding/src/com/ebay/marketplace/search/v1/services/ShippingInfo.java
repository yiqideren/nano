// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container holding the item's shipping details.
 * 
 */
public class ShippingInfo implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	public Amount shippingServiceCost;	
	
	@Element
	public String shippingType;	
	
	@Element
	public List<String> shipToLocations;	
	
	@Element
	public Boolean expeditedShipping;	
	
	@Element
	public Boolean oneDayShippingAvailable;	
	
	@Element
	public Integer handlingTime;	
	
	@Element
	public Boolean intermediatedShipping;	
	
	@Element
	public String delimiter;	
	
	@AnyElement
	public List<Object> any;	
	
    
}