import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrangement {

	@Test
	void test() {
		Arrangement aranjare=new Arrangement();
		Card carte=new Card('A','♣');
		int output= aranjare.put(carte);
		assertEquals(1,output);
		
		output= aranjare.put(new Card('2','♥'));
		assertEquals(1,output);
		
		output= aranjare.put(new Card('2','♥'));
		assertEquals(0,output);
		
		char number1=carte.getNumber();
		assertEquals('A',number1);
		
		char suit1=carte.getSuit();
		assertEquals('♣',suit1);
	}

}
