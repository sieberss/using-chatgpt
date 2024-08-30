package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
        System.out.println(isPalindrome("ANNA"));
        System.out.println(isPalindrome("einnegermitgazellezagtimregennie"));
        System.out.println(isPalindrome("blablaua"));
        System.out.println(generatePrimes(100));
    }

    private static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        if (n <= 0) {
            return primes;  // Return an empty list if n is 0 or negative
        }

        int count = 0;  // To count the number of primes found
        int number = 2;  // Start checking from the first prime number (2)

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }

        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // If divisible by any number other than 1 and itself, not prime
            }
        }

        return true;  // If no divisors found, it's prime
    }

    public static String reverseString(String input) {
        // Check if the string is null or empty
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Initialize a StringBuilder with the input string
        StringBuilder reversedString = new StringBuilder(input);

        // Use the reverse method provided by StringBuilder
        reversedString.reverse();

        // Convert StringBuilder back to String and return
        return reversedString.toString();
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String input) {
        // Check if the string is null or empty
        if (input == null || input.isEmpty()) {
            return true;  // An empty string or null is considered a palindrome
        }

        // Initialize two pointers: one at the start and one at the end of the string
        int left = 0;
        int right = input.length() - 1;

        // Loop until the pointers meet in the middle
        while (left < right) {
            // Compare characters at the current pointers
            if (input.charAt(left) != input.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }

            // Move the pointers towards the center
            left++;
            right--;
        }

        return true;  // If all characters matched, it's a palindrome
    }

}
