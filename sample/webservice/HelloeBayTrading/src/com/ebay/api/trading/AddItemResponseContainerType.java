// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * This container has all of the resulting information from an AddItems call. There will be one
 * container per container specified in the request.
 * 
 */
public class AddItemResponseContainerType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "StartTime")
	@Order(value=1)
	public Date startTime;	
	
	@Element(name = "EndTime")
	@Order(value=2)
	public Date endTime;	
	
	@Element(name = "Fees")
	@Order(value=3)
	public FeesType fees;	
	
	@Element(name = "CategoryID")
	@Order(value=4)
	public String categoryID;	
	
	@Element(name = "Category2ID")
	@Order(value=5)
	public String category2ID;	
	
	@Element(name = "CorrelationID")
	@Order(value=6)
	public String correlationID;	
	
	@Element(name = "Errors")
	@Order(value=7)
	public List<ErrorType> errors;	
	
	@Element(name = "Message")
	@Order(value=8)
	public String message;	
	
	@Element(name = "DiscountReason")
	@Order(value=9)
	public List<DiscountReasonCodeType> discountReason;	
	
	@AnyElement
	@Order(value=10)
	public List<Object> any;	
	
    
}