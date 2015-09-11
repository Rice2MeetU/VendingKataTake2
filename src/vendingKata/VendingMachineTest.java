package vendingKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {
	
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
		VendingMachine testMachine = new VendingMachine();
		assertEquals("0.25", testMachine.display("q"));
		assertEquals("0.05", testMachine.display("n"));
		assertEquals("0.10", testMachine.display("d"));
		assertEquals("0.01", testMachine.display("p"));
	}

}
