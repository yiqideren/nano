// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Calls made form seller or buyer find out what the most relevant tags and values are for a given category
 * 
 */
@RootElement(name = "GetCategorySpecificsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategorySpecificsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Recommendations")
	@Order(value=0)
	public List<RecommendationsType> recommendations;	
	
	@Element(name = "TaskReferenceID")
	@Order(value=1)
	public String taskReferenceID;	
	
	@Element(name = "FileReferenceID")
	@Order(value=2)
	public String fileReferenceID;	
	
    
}