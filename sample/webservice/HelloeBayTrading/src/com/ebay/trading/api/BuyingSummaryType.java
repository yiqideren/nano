// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Type defining the <b>BuyingSummary</b> container returned in
 * <b>GetMyeBayBuying<b>. The <b>BuyingSummary</b> container
 * consists of data that summarizes the buyer's recent buying activity, including the
 * number of items bid on, the number of items buyer is winning, and the number of items
 * the buyer has won. The <b>BuyingSummary</b> container is only returned if
 * the <b>BuyingSummary.Include</b> field is included in the GetMyeBayBuying request and set to
 * 'true'.
 * 
 */
public class BuyingSummaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BiddingCount")
	@Order(value=0)
	public Integer biddingCount;	
	
	@Element(name = "WinningCount")
	@Order(value=1)
	public Integer winningCount;	
	
	@Element(name = "TotalWinningCost")
	@Order(value=2)
	public AmountType totalWinningCost;	
	
	@Element(name = "WonCount")
	@Order(value=3)
	public Integer wonCount;	
	
	@Element(name = "TotalWonCost")
	@Order(value=4)
	public AmountType totalWonCost;	
	
	@Element(name = "WonDurationInDays")
	@Order(value=5)
	public Integer wonDurationInDays;	
	
	@Element(name = "BestOfferCount")
	@Order(value=6)
	public Integer bestOfferCount;	
	
    
}