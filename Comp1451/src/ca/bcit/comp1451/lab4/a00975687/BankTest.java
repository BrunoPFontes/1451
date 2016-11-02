package ca.bcit.comp1451.lab4.a00975687;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class BankTest {
	
	private Bank b1;
	private Bank b2;
	
	public BankTest(){
		b1 = new Bank("Abc", "Abc", 10000);
		b2 = new Bank("Abc1", "Ab1",20000);
		
	}
	
	@Test
	public void testFirstName(){
		String name = b1.setFirstName("aBcDe");
		assertEquals("Abcde", name);
	}
	
	@Test
	public void testFirstName2(){
		String name = b2.setFirstName("aBCDEf");
		assertEquals("Abcdef", name);
	}
	
	@Test
	public void testLastName(){
		String name = b1.setFirstName("aBcDeF");
		assertEquals("Abcdef", name);
	}
	
	@Test
	public void testLastName2(){
		String name = b2.setFirstName("aBCdef");
		assertEquals("Abcdef", name);
	}
	
	
	@Test
	public void testDeposit(){
		double deposit = b1.deposit(1000);
		assertEquals(11000, deposit, 0.1 );
	}
	
	@Test
	public void testDeposit2(){
		double deposit = b2.deposit(2000);
		assertEquals(22000, deposit, 0.1 );
	}
	
	@Test
	public void testWithdraw(){
		double withdraw = b1.withdraw(1000);
		assertEquals(9000, withdraw, 0.1 );
	}
	
	@Test
	public void testWithdraw2(){
		double withdraw = b2.withdraw(2000);
		assertEquals(18000, withdraw, 0.1 );
	}
	
	@Test
	public void testTransfer(){
		double transfer = b1.transfer(1000, b2);
		assertEquals(9000, transfer, 0.1 );
		
		double deposit = b2.deposit(1000);
		assertEquals(11000, transfer, 0.1 );
		
	}
	
	@Test
	public void testTransfer2(){
		double withdraw = b2.withdraw(2000);
		assertEquals(20000, withdraw, 0.1 );
		
		double deposit = b1.deposit(2000);
		assertEquals(12000, deposit, 0.1 );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
