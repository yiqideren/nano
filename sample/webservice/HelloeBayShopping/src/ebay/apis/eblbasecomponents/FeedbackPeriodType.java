// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains the data for one type of feedback for one predefined time
 * period. Parent FeedbackPeriodArrayType object indicates the type of
 * feedback counted: positive, neutral, negative, or total. 
 * 
 */
public class FeedbackPeriodType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PeriodInDays")
	@Order(value=0)
	public Integer periodInDays;	
	
	@Element(name = "Count")
	@Order(value=1)
	public Long count;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}