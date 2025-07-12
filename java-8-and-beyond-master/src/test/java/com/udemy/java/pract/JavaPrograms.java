package com.udemy.java.pract;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JavaPrograms {

	public static void main(String[] args) {
		// System.out.println(FirstNonRepeatedCharacter("ssdddgg"));

		// System.out.println(isPalindrome("madam"));

		streamExample();
	}

	static Character FirstNonRepeatedCharacter(String str) {
		Map<Character, Integer> characterCountMap = new LinkedHashMap<>();

		// Populate the map with character counts
		for (char ch : str.toCharArray()) {
			characterCountMap.put(ch, characterCountMap.getOrDefault(ch, 0) + 1);
		}

		System.out.println(characterCountMap);

		// Find the first non-repeated character
		for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		// If no non-repeated character is found, return a null character
		return '\0';

	}

	public static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

	static void secondLargestNumber() {
		List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 50, 75, 65);

		// Step 1: Find the second largest number in the list
		Optional<Integer> secondLargest = numbers.stream().distinct() // Step 2: Remove duplicates
				.sorted(Comparator.reverseOrder()) // Step 3: Sort in descending order
				.skip(1) // Step 4: Skip the first (largest) number
				.findFirst(); // Step 5: Get the second largest number

		// Step 6: Display the result
		if (secondLargest.isPresent()) {
			System.out.println("The second largest number is: " + secondLargest.get());
		} else {
			System.out.println("The list does not have enough unique numbers.");
		}
	}

	public static void streamExample() {
		List<String> list = List.of("vijay", "gangu", "Ron");

		list.stream().filter(e -> e.startsWith("g")).map(String::toUpperCase).forEach(e -> System.out.println(e));

		System.out.println(list.stream().filter(e -> e.startsWith("e")).findFirst().orElse("No Name"));
	}

}
