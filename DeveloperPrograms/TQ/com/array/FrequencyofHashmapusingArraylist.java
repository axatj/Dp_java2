package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyofHashmapusingArraylist {
	public static void main(String[] args) {
		// Sample ArrayList with strings
		List<String> arrayList = new ArrayList<>();
		arrayList.add("apple");
		arrayList.add("banana");
		arrayList.add("orange");
		arrayList.add("grapes");

		// Approach 1: Using a HashMap with nested loops
		Map<Character, Integer> charFrequencyMap1 = new HashMap<>();

		for (String word : arrayList) {
			for (char c : word.toCharArray()) {
				charFrequencyMap1.put(c, charFrequencyMap1.getOrDefault(c, 0) + 1);
			}
		}

		// Display the character frequencies
		System.out.println("Approach 1:");
		for (Map.Entry<Character, Integer> entry : charFrequencyMap1.entrySet()) {
			System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
		}
	}
}
