package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData ed = new EncapsulateTheData();

	@Test
	void test() {
		ed.setItemsRecieved(9);
		assertEquals(9, ed.getItemsRecieved());
		ed.setItemsRecieved(-5);
		assertEquals(0, ed.getItemsRecieved());
		
		ed.setDegreesTurned(180);
		assertEquals(180, ed.getDegreesTurned());
		ed.setDegreesTurned(369);
		assertEquals(0, ed.getDegreesTurned());
		
		ed.setNomenclature("hi");
		assertEquals("hi", ed.getNomenclature());
		ed.setNomenclature("");
		assertEquals(" ", ed.getNomenclature());
		
		ed.setMemberObj(0);
		assertEquals(0, ed.getMemberObj());
		ed.setMemberObj(true);
		assertEquals(true, ed.getMemberObj());
		ed.setMemberObj("hi");
		assertEquals("hi", ed.getMemberObj());
	}

}
