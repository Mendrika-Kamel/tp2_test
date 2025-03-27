package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;




class ControlEmmenagerTest {
	
	private Village village;
	private Chef abraracourcix;
	private ControlEmmenager controlEmmenager;
	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village("le village ninja", 10, 5);
		village.setChef(abraracourcix);
		controlEmmenager = new ControlEmmenager(village);
		
		
	}

	@Test
	void testControlEmmenager() {
		fail("Not yet implemented");
	}

	@Test
	void testIsHabitant() {
		controlEmmenager.ajouterGaulois("Toto", 5);
		assertTrue(controlEmmenager.isHabitant("Toto"));
	}

	@Test
	void testAjouterDruide() {
		fail("Not yet implemented");

	}

	@Test
	void testAjouterGaulois() {
		fail("Not yet implemented");
	}

}
