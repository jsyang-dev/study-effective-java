package item06;

public class Main {

    public static void main(String[] args) {
        slow();
        fast();
    }

    private static void slow() {
        boolean result = false;
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            result = RomanNumerals.isRomanNumeralSlow("MCMLXXVI");
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(result);
    }

    private static void fast() {
        boolean result = false;
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            result = RomanNumerals.isRomanNumeralFast("MCMLXXVI");
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(result);
    }
}
