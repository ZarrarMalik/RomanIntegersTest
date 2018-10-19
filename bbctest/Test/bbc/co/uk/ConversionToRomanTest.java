package bbc.co.uk;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class ConversionToRomanTest {
	ConversionToRoman cb = new ConversionToRoman();
	
		 
	  @Test
	    public void isGreaterTest() {
	        System.out.println("Test");
	        ConversionToRoman cb1 = new ConversionToRoman();
	        assertTrue("Num 1 is greater than Num 2", cb1.isGreater(4, 3));
	    }
	  

	@Test
	public void IsTrue() {
		assertTrue("Statement is True", true);
	}

	@Test
	public void firsttest() {
		System.out.println("First Test");
		
	}

	@Test
	public void threeNineNineNineTest() {
		ConversionToRoman cb = new ConversionToRoman();
    	 assertEquals("",cb.generate(3999));
	}
	
	@Test
	public void only4Test() {
		ConversionToRoman cb = new ConversionToRoman();
    	 assertEquals("IV",cb.generate(4));
	}
	@Test
	public void fortyNineTest() {
		ConversionToRoman cb = new ConversionToRoman();
    	 assertEquals("XLIX",cb.generate(49));
	}
	
	@Test
	public void hundred() {
		ConversionToRoman cb = new ConversionToRoman();
    	 assertEquals("C",cb.generate(100));
	}
	
	@Test
	public void ninehundredninetynine() {
		ConversionToRoman cb = new ConversionToRoman();
    	 assertEquals("CMXCIX",cb.generate(999));
	}
	@Test
	public void twothousandforty() {
		ConversionToRoman cb = new ConversionToRoman();
    	 assertEquals("MMXL",cb.generate(2040));
	}
	
	
}

