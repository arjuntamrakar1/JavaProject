import java.util.*;
import java.io.*;

public class JavaInterviewScenarios {

    // Reversing a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int reversed = 0, original = number;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    // Generate prime numbers up to a limit
    public static List<Integer> generatePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Factorial using recursion
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Generate Fibonacci series
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> series = new ArrayList<>();
        int a = 0, b = 1;
        series.add(a);
        if (n > 1) series.add(b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            series.add(next);
            a = b;
            b = next;
        }
        return series;
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    // Count vowels and consonants in a string
    public static Map<String, Integer> countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        String lowerCase = input.toLowerCase();
        for (char c : lowerCase.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("Vowels", vowels);
        result.put("Consonants", consonants);
        return result;
    }

    // Producer-Consumer using threads
    public static void producerConsumerDemo() {
        Queue<Integer> queue = new LinkedList<>();
        int capacity = 5;

        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                synchronized (queue) {
                    while (queue.size() == capacity) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    queue.add(value);
                    System.out.println("Produced: " + value);
                    value++;
                    queue.notifyAll();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    int consumed = queue.poll();
                    System.out.println("Consumed: " + consumed);
                    queue.notifyAll();
                }
            }
        });

        producer.start();
        consumer.start();
    }

    public static void main(String[] args) {
        // Example usage of the methods
        System.out.println("Reversed String: " + reverseString("hello"));
        System.out.println("Is 121 a Palindrome? " + isPalindrome(121));
        System.out.println("Prime Numbers up to 20: " + generatePrimes(20));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci Series (5 terms): " + generateFibonacci(5));

        int[] arr = {3, 1, 4, 1, 5};
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));

        System.out.println("Vowels and Consonants: " + countVowelsAndConsonants("hello world"));

        // Producer-Consumer example
        producerConsumerDemo();
    }
}

