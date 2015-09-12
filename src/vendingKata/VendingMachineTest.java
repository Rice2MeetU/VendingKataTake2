package vendingKata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	VendingMachine testMachine;
	
	@Before
	public void setUp(){
		testMachine = new VendingMachine();
	}
	
	/*
	@Test
	public void whenACoinGoesInTheVendingMachineTheDisplayUpdates() {
		VendingMachine testMachine = new VendingMachine();
		assertEquals("q", testMachine.display("q"));
		assertEquals("d", testMachine.display("d"));
		assertEquals("n", testMachine.display("n"));
		assertEquals("p", testMachine.display("p"));
	}
	
	*/
	
	@Test
	public void whenACoinGoesInTheVendingMachineUnderstandsItsValueAndTheDisplayUpdates() {
		assertEquals("0.25", testMachine.display("q"));
		assertEquals("0.05", testMachine.display("n"));
		assertEquals("0.10", testMachine.display("d"));
		//assertEquals("0.01", testMachine.display("p"));
	}
	
	@Test
	public void whenAPennyIsInsertedTheVendingMachineRejectsItButAcceptsOtherCoins(){
		assertNotEquals("0.01", testMachine.display("p"));
		assertEquals("0.25", testMachine.display("q"));
		assertEquals("0.05", testMachine.display("n"));
	}
	
	@Test
	public void whenAProductIsSelectedTheMachineChecksToSeeIfEnoughMoneyIsInserted(){
		assertEquals("Thank You", testMachine.checkPurchase("cola", 1.00));
		assertEquals("Thank You", testMachine.checkPurchase("chips", 0.50));
		assertEquals("Insufficient Funds", testMachine.checkPurchase("candy", 0.30));
	}
	
	
	@Test
	public void whenAProductIsSelectedAndThereIsChangeLeftAfterThePurchase(){
		//assertSame(0.10, testMachine.dispenseChange("cola", 1.10));
		//assertSame(0.00, testMachine.dispenseChange("chips", 0.50));
		//assertSame(0.35, testMachine.dispenseChange("candy", 1.00));
	}
	
	@Test
	public void whenACustomerWantsTheirCoinsReturned(){
		assertSame(1.10, testMachine.dispenseChange("return coins", 1.10));
	}
	

}
