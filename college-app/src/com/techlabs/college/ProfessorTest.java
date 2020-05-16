package com.techlabs.college;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ProfessorTest {

	@Test
	void testProfessor() {
		Professor professor = new Professor(1, "Mumbai", new Date(), 10000);
		assertEquals(1, professor.getId());
	}

}
