package csce247.assignments.command;

public class StockTrade {

	
	public StockTrade() {}
	
	public void buy(String stockName, int numShares) {
		
		System.out.println("Bought "+numShares+ " of "+stockName);
	}
	
	public void sell(String stockName, int numShares) {
		
		System.out.println("Sold "+numShares+ " of "+stockName);
	}
	
	
}
