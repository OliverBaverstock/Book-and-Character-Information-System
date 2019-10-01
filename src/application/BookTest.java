package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	Book b;

	@BeforeEach
	void setUp() throws Exception{
		b = new Book();
		b.setTitle("Hubert's Big Day Out");
		b.setAuthor("Hubert");
		b.setGenre("Comedy");
		b.setNumberOfPages(231);
	}

	@Test
	void testGetTitle() {
		assertEquals("Hubert's Big Day Out", b.getTitle());
	}

	@Test
	void testSetTitle() {
		assertEquals("Hubert's Big Day Out", b.getTitle());
		b.setTitle("Hubert's Next Day Out");
		assertEquals("Hubert's Next Day Out", b.getTitle());
	}

	@Test
	void testGetAuthor() {
		assertEquals("Hubert", b.getAuthor());
	}

	@Test
	void testSetAuthor() {
		assertEquals("Hubert", b.getAuthor());
		b.setAuthor("Oliver");
		assertEquals("Oliver", b.getAuthor());
	}

	@Test
	void testGetGenre() {
		assertEquals("Comedy", b.getGenre());
	}

	@Test
	void testSetGenre() {
		assertEquals("Comedy", b.getGenre());
		b.setGenre("Romance");
		assertEquals("Romance", b.getGenre());
	}

	@Test
	void testGetNumberOfPages() {
		assertEquals(231, b.getNumberOfPages());
	}

	@Test 
	void testSetNumberOfPages() {
		assertEquals(231, b.getNumberOfPages());
		b.setNumberOfPages(452);
		assertEquals(452, b.getNumberOfPages());
	}

	@Test
	void testSetNumWith2000() {
		assertThrows(IllegalArgumentException.class,()-> {
			b.setNumberOfPages(2000);
		});
	}

}
