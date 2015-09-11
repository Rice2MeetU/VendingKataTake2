package vendingKata;

public class VendingMachine {
	
	public String display(String inputCoin){
		String currentDisplay = "Insert Coins";
		
		if (inputCoin.equals("q") || inputCoin.equals("Q")){
			currentDisplay = "0.25";
		}
		else if (inputCoin.equals("n") || inputCoin.equals("N")){
			currentDisplay = "0.05";
		}
		else if (inputCoin.equals("d") || inputCoin.equals("D")){
			currentDisplay = "0.10";
		}
		else if (inputCoin.equals("p") || inputCoin.equals("P")){
			currentDisplay = "Sorry, pennies are not accepted";
		}
		
		return currentDisplay;
	}
	
	public String checkPurchase(String productChoice, Double amountInserted){
		String purchaseResponse;
		
		if (productChoice.equals("cola") && amountInserted == 1.00){
			purchaseResponse = "Thank You";
		}
		else if (productChoice.equals("chips") && amountInserted == 0.50){
			purchaseResponse = "Thank You";
		}
		else if (productChoice.equals("candy") && amountInserted == 0.65){
			purchaseResponse = "Thank You";
		}
		else {
			purchaseResponse = "Insufficient Funds";
		}
		
		return purchaseResponse;
	}
}
