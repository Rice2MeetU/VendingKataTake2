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
			currentDisplay = "0.01";
		}
		
		return currentDisplay;
	}
}
