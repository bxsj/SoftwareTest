package noUse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTranigleProblem {
	@Test
	public void testTranigleProblem() {
		TranigleProblem demo = new TranigleProblem();
	    assertEquals(true,demo.canTakeOut(83));
	    assertEquals(true,demo.canTakeOut(33));
	    assertEquals(true,demo.canTakeOut(32));
	    assertEquals(true,demo.canTakeOut(7));
	    assertEquals(true,demo.canTakeOut(1));
	}
	@Test
	public void testTPFault() {
		TranigleProblem demoFault = new TranigleProblem();
		assertEquals(false,demoFault.canTakeOut(79));
	}
	@Test
	public void testTPFault1() {
		TranigleProblem demoFault = new TranigleProblem();
		assertEquals(false,demoFault.canTakeOut(74));
	}
	@Test
	public void testTPFault2() {
		TranigleProblem demoFault = new TranigleProblem();
		assertEquals(false,demoFault.canTakeOut(49));
	}
	@Test
	public void testTPFault3() {
		TranigleProblem demoFault = new TranigleProblem();
		assertEquals(false,demoFault.canTakeOut(34));
	}
	

}
