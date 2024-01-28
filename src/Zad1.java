public class Zad1 {
    public static void main(String[] args) {
//        wypisz wszystkie liczby 3 cyfrowe ktorych suma cyfr dziesiatek i setek jest rowna cyfrze jednosci. np: 314 bo 3+1=4

        for (int i = 100; i < 1000; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;

            if ((hundreds + tens) == ones) {
                System.out.println(i);
            }
        }
    }
}
