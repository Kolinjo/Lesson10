package exercises;

import java.util.List;

import examples.FileHelper;

public class Palindrome {

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}
	
	
	public boolean isWordInDictonary (String word) {
		
		List<String> array = new Palindrome().loadWords();
		
		if (array.contains(word)) {
			return true;
		}else {
		
		return false;
		}
	}
	
	public boolean isPalindrome (String word) {
		char array []= word.toCharArray();
		for (int i = 0; i < array.length/2; i++) {
			if (array[i]!=array[array.length-i-1]) {
				return false;
			}
		}
		return true;
	}
}
