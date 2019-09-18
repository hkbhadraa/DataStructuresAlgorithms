package com.bayareala8s.datastructuresalgorithms;
import java.util.*;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		
		String word = "abcdefgaaaa";
		HashMap<Character,Integer> characterMap = new HashMap<Character, Integer>();
		char[] characters = word.toCharArray();
		
		for(char ch: characters) {
			
			System.out.println(ch);
			if(characterMap.containsKey(ch)) {
				characterMap.put(ch, characterMap.get(ch) + 1);
			}
			else {
				characterMap.put(ch,1);
			}
			
		}

		System.out.println(characterMap.entrySet());
	}
}	
		
