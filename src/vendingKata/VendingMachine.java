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
		int[] products = new int[3];
		products[0] = 1;
		products[1] = 0;
		products[2] = 3;
		
		
		if (productChoice.equals("cola") && amountInserted >= 1.00){
			
			if (products[0] == 0){
				purchaseResponse = "Sold Out";
			}
			else {
				purchaseResponse = "Thank You";
				products[0] += (-1);
			}
		}
		else if (productChoice.equals("chips") && amountInserted >= 0.50){
			if (products[1] == 0){
				purchaseResponse = "Sold Out";
			}
			else {
				purchaseResponse = "Thank You";
				products[1] += (-1);
			}
		}
		else if (productChoice.equals("candy") && amountInserted >= 0.65){
			if (products[2] == 0){
				purchaseResponse = "Sold Out";
			}
			else {
				purchaseResponse = "Thank You";
				products[2] += (-1);
			}
		}
		else {
			purchaseResponse = "Insufficient Funds";
		}
		
		return purchaseResponse;
	}
	
	public double dispenseChange(String productChoice, double amountInserted){
		double remainingChange = 0;
		
		if (productChoice.equals("cola") && amountInserted >= 1.00){
			
			if (amountInserted > 1.00){
				remainingChange = (amountInserted - 1.00);
			}
		}
		else if (productChoice.equals("chips") && amountInserted >= 0.50){
			
			if (amountInserted > 0.50){
				remainingChange = (amountInserted - 0.50);
			}
		}
		else if (productChoice.equals("candy") && amountInserted >= 0.65){
			
			if (amountInserted > 0.65){
				remainingChange = (amountInserted - 0.65);
			}
		}
		else if (productChoice.equals("return coins")){
			remainingChange = amountInserted;
		}
		else {
			remainingChange = 0;
		}
		
		return remainingChange;
	}
	
}
