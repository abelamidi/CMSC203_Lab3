import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook g1, g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(9.2);
		g1.addScore(7.5);
		
		g2 = new GradeBook(5);
		g2.addScore(13.2);
		g2.addScore(8.5);	
	}
	

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}


	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("9.2 7.5 "));
		assertTrue(g2.toString().equals("13.2 8.5 "));
	}

	@Test
	void testSum() {
		assertEquals(16.7, g1.sum(), .0001);
		assertEquals(21.7, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(7.5, g1.minimum(), .001);
		assertEquals(8.5, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(9.2, g1.finalScore(), .001);
		assertEquals(13.2, g2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
	}
	
}
