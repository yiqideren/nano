// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * A product review written by an eBay member.
 * 
 */
public class ReviewType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "URL")
	@Order(value=0)
	public String url;	
	
	@Element(name = "Title")
	@Order(value=1)
	public String title;	
	
	@Element(name = "Rating")
	@Order(value=2)
	public Integer rating;	
	
	@Element(name = "Text")
	@Order(value=3)
	public String text;	
	
	@Element(name = "UserID")
	@Order(value=4)
	public String userID;	
	
	@Element(name = "CreationTime")
	@Order(value=5)
	public Date creationTime;	
	
	@AnyElement
	@Order(value=6)
	public List<Object> any;	
	
    
}