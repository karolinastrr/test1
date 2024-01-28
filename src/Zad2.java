public class Zad2 {
    public static void main(String[] args) {
//        dla każdej liczby dwucyfrowej wypisz jej ilosc dzielników.

        for (int i = 10; i < 100; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            System.out.println("Liczba dzielników dla liczby: " + i + " wynosi: " + counter);
        }
    }
}
