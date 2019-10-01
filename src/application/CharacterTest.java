package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterTest {

	Character c;
	
	@BeforeEach
	void setUp() throws Exception{
		c = new Character();
		c.setCharacterName("Hubert");
		c.setGender("Male");
		c.setCharacterDescription("Jolly");
	}
	
	@Test
	void testGetCharacterName() {
		assertEquals("Hubert", c.getCharacterName());
	}
	
	@Test
	void testSetCharacterName() {
		assertEquals("Hubert",c.getCharacterName());
		c.setCharacterName("Oliver");
		assertEquals("Oliver", c.getCharacterName());
	}
	
	@Test
	void testGetGender() {
		assertEquals("Male", c.getGender());
	}
	
	@Test
	void testSetGender() {
		assertEquals("Male",c.getGender());
		c.setGender("Female");
		assertEquals("Female", c.getGender());
	}
	
	
	void testGetCharacterDescription() {
		assertEquals("Jolly", c.getCharacterDescription());
	}
	
	void testSetCharacterDescription() {
		assertEquals("Jolly", c.getCharacterDescription());
		c.setCharacterDescription("Happy");
		assertEquals("Happy", c.getCharacterDescription());
	}
}
