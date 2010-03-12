package dojophb;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	@Before
	public void inicializa(){
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testaMultiplo3(){
		assertEquals(true, fizzBuzz.checaMultiplo(3,3));
		assertEquals(true, fizzBuzz.checaMultiplo(6,3));
		assertEquals(false, fizzBuzz.checaMultiplo(7,3));
		assertEquals(false, fizzBuzz.checaMultiplo(131,3));
		assertEquals(true, fizzBuzz.checaMultiplo(69,3));
	}
	
	@Test
	public void testaNumeroComDigito3(){
		assertEquals(true, fizzBuzz.checaDigito(3, 3));
		assertEquals(true, fizzBuzz.checaDigito(31, 3));
		assertEquals(true, fizzBuzz.checaDigito(153, 3));
		assertEquals(false, fizzBuzz.checaDigito(5, 3));
		assertEquals(false, fizzBuzz.checaDigito(1685, 3));
	}
	
	@Test
	public void testaMultiplo5(){
		assertEquals(true, fizzBuzz.checaMultiplo(5,5));
		assertEquals(true, fizzBuzz.checaMultiplo(25,5));
		assertEquals(false, fizzBuzz.checaMultiplo(27,5));
		assertEquals(false, fizzBuzz.checaMultiplo(131,5));
		assertEquals(true, fizzBuzz.checaMultiplo(70,5));
	}
	
		
	@Test
	public void testaNumeroComDigito5(){
		assertEquals(true, fizzBuzz.checaDigito(5,5));
		assertEquals(true, fizzBuzz.checaDigito(51,5));
		assertEquals(true, fizzBuzz.checaDigito(151,5));
		assertEquals(false, fizzBuzz.checaDigito(4,5));
		assertEquals(false, fizzBuzz.checaDigito(1683,5));
	}
	
	@Test
	public void testaMutiplo3e5(){
		assertEquals(true, fizzBuzz.checaMultiplo(15,3) && fizzBuzz.checaMultiplo(15,5));
		assertEquals(true, fizzBuzz.checaMultiplo(30,3) && fizzBuzz.checaMultiplo(30,5));
		assertEquals(false, fizzBuzz.checaMultiplo(35,3) && fizzBuzz.checaMultiplo(35,5));
	}
	
	@Test
	public void testaContem3e5(){
		assertEquals(true, fizzBuzz.checaDigito(35,5) && fizzBuzz.checaDigito(35, 3));
		assertEquals(false, fizzBuzz.checaDigito(25,5) && fizzBuzz.checaDigito(25, 3));
		assertEquals(false, fizzBuzz.checaDigito(32,5) && fizzBuzz.checaDigito(32, 3));
	}
	
	@Test
	public void testaFizz(){
		assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(25));
		assertEquals("44", fizzBuzz.fizzBuzz(44));
	}
	
	
}
