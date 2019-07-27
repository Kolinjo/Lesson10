package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {
	
	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("apple"));
	}
	
	// 2. Test that a word exists in the dictionary 
	
	void testIsWordInDictonary () {
		assertTrue(testPalindrome.isWordInDictonary("java"));
	}
	
	// 3. Test that a word is a palindrome
	void isPalindrome () {
		assertTrue(testPalindrome.isPalindrome("kayak"));
		assertTrue(testPalindrome.isPalindrome("avaj"));
	}

}
