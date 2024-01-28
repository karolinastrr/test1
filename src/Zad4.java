import java.util.Arrays;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
//        Zapytaj użytkownika o liczby rozdzielone spacją, następnie:
//- wypisz medianę wprowadzonych liczb.
//- wypisz liczbę z największą ilością dzielników.
//- wypisz wszystkie liczby pierwsze.

        String line;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Provide numbers divided by spaces");
            line = scanner.nextLine();
        }

        String[] stringArr = line.split(" ");
        int[] intArr = new int[stringArr.length];
        try {
            for (int i = 0; i < stringArr.length; i++) {
                intArr[i] = Integer.parseInt(stringArr[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("It is not possible to convert the string to an integer.");
        }


        System.out.println("PRIME NUMBERS");
        findAllPrimeNumbers(intArr);
        System.out.println("WITH MOST DIVISORS");
        System.out.println(findNumberWithMostDivisors(intArr));
        System.out.println("MEDIAN");
        System.out.println(findMedian(intArr));

    }

    public static double findMedian(int[] arr) {
        double median;
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            median = arr[arr.length / 2];
        } else {
            int firstMiddleNumber = arr[(arr.length / 2) - 1];
            int secondMiddleNumber = arr[arr.length / 2];
            median = (double) (firstMiddleNumber + secondMiddleNumber) / 2;
        }
        return median;
    }

    public static void findAllPrimeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNumberWithMostDivisors(int[] arr) {
        int numWithMostDivisors = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (countDivisors(numWithMostDivisors) < countDivisors(arr[i])) {
                numWithMostDivisors = arr[i];
            }
        }
        return numWithMostDivisors;
    }

    public static int countDivisors(int number) {
        int amountOfDivisors = 0;
        if (number == 1) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                amountOfDivisors++;
            }
        }
        return amountOfDivisors;
    }
}
