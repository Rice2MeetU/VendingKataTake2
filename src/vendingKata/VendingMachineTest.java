package vendingKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void whenACoinGoesInTheVendingMachineTheDisplayUpdates() {
		VendingMachine testMachine = new VendingMachine();
		assertEquals("q", testMachine.display("q"));
		assertEquals("d", testMachine.display("d"));
		assertEquals("n", testMachine.display("n"));
		assertEquals("p", testMachine.display("p"));
	}
	
	//@Test
	//public void whenACoinGoesInTheVendingMachineUnderstandsItsValue

}
