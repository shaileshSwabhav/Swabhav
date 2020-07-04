package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.Mark;
import com.techlab.game.Player;

class PlayerTest {

	@Test
	void testPlayerConstructor() {

		// Arrange
		String expectedName = "Sam";
		String expectedMark = "X";
		
		// Act
		Player p = new Player("Sam", Mark.X);
		
		// Assert
		assertEquals(expectedName, p.getName());
		assertEquals(expectedMark, p.getMark());
		
	}

}
