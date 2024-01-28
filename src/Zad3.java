import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
//        Poproś użytkownika o podanie 10ciu roznych napisów.
//Wpisz je wszystkie do tablicy a następnie:
//- wypisz najdłuższy napis i ile ma znaków.
//- wypisz najkrótszy napis i ile ma znaków.
//- wypisz ile jest palindromów wśród napisów.
// (palindrom to taki wyraz czytany od tyłu jest taki sam jak czytany od przodu np: kajak)
// [podczas porownania ignoruj wielkosc liter]

        String[] words = new String[10];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Provide 10 words");
            for (int i = 0; i < 10; i++) {
                words[i] = scanner.nextLine();
            }
        }

        String longestWord = findLongestWord(words);
        String shortestWord = findShortestWord(words);

        System.out.println("Najdłuższym słowem w tablicy jest: " + longestWord + " i ma długość: " + longestWord.length());
        System.out.println("Najkrótszym słowem w tablicy jest: " + shortestWord + " i ma długość: " + shortestWord.length());

        int amountOfPalindromes = countPalindromes(words);
        System.out.println("There are: " + amountOfPalindromes + " palindromes in table");
    }

    public static int countPalindromes(String[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                counter++;
            }
        }
        return counter;
    }


    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - i - 1))
                return false;
        }
        return true;
    }

    public static String findLongestWord(String[] arr) {
        String longestWord = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (longestWord.length() < arr[i].length()) {
                longestWord = arr[i];
            }
        }
        return longestWord;
    }

    public static String findShortestWord(String[] arr) {
        String shortestWord = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (shortestWord.length() > arr[i].length()) {
                shortestWord = arr[i];
            }
        }
        return shortestWord;
    }
}
