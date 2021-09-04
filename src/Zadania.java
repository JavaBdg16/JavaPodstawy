import java.util.Arrays;

public class Zadania {

    public static void main(String[] args) {
        // zadanie1();
        // zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie6();
        zadanie7();
    }

    /**
     * Napisz program, który dla podanej liczby (np. 12345) wypisze ją w odwrotnej
     * kolejności (54321)
     */
    private static void zadanie1() {
        System.out.println();
        System.out.println("Zadanie 1");

        int liczba = 12345;
        int result = 0;

        while (liczba > 0) {
            int reszta = liczba % 10;

            result = result * 10 + reszta;

            liczba = liczba / 10;
        }

        System.out.println(result);

        String sLiczba = "12345";
        String sResult = "";

        for (char c : sLiczba.toCharArray()) {
            sResult = c + sResult;
        }

        System.out.println(sResult);

    }

    /**
     * Napisz program, który dla zadanej tablicy (np. [1,2,3,4,5]) policzy sumę wszystkich
     * elementów (15)
     */
    private static void zadanie2() {
        System.out.println();
        System.out.println("Zadanie 2");

        int[] tab = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int element : tab) {
            sum += element;
        }

        System.out.println("Suma = " + sum);

        sum = 0;

        int index = 0;
        while (index < tab.length) {
            sum += tab[index++];
        }

        System.out.println("Suma = " + sum);
    }

    /**
     * Napisz program, który dla zadanej tablicy (np. [1,2,3,4,5]) policzy średnią z wszystkich
     * elementów (3)
     */
    private static void zadanie3() {
        System.out.println();
        System.out.println("Zadanie 3");

        int[] tab = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int element : tab) {
            sum += element;
        }

        int srednia = sum / tab.length;
        System.out.println("Srednia = " + srednia);
    }

    /**
     * Napisz program, który wyznaczy indeks elementu tablicy (np. indeks dla liczby 9 w
     * tablicy [1,4,5,9,12,99] to 3)
     */
    private static void zadanie4() {
        System.out.println();
        System.out.println("Zadanie 4");

        int searchValue = 8;
        boolean isFound = false;
        int[] tab = { 1, 4, 5, 9, 12, 99 };
        int index = 0;

        do {
            if (tab[index] == searchValue) {
                isFound = true;
                break;
            }
            index++;
        } while (index < tab.length);

        if (isFound) {
            System.out.println("Liczba " + searchValue + " znajduje się na indeksie " + index);
        } else {
            System.out.println("Liczba " + searchValue + " nie znajduje w tablicy");
        }
    }

    /**
     * Napisz program, który wykona kopię tablicy element po elemencie
     */
    private static void zadanie5() {
        System.out.println();
        System.out.println("Zadanie 5");

        int[] tab = { 1, 4, 5, 9, 12, 99 };
        int[] copyTab = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            copyTab[i] = tab[i];
        }

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(copyTab));
    }

    /**
     * Napisz program, który wyznaczy najmniejszą i największą wartość w tablicy
     */
    private static void zadanie6() {
        System.out.println();
        System.out.println("Zadanie 6");

        int[] tab = { 1, 4, 5, 9, 12, 99 };
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;

        int min = tab[0];
        int max = tab[0];

        for (int element : tab) {
            if (element < min) {
                min = element;
            }

            if (element > max) {
                max = element;
            }
        }

        System.out.println("Dla tablicy " + Arrays.toString(tab) + " minimalna wartość to " + min + ", maksymalna wartość to " + max);
    }

    /**
     * Napisz program, który wykorzystując instrukcję switch sprawdzi, czy podana liczba
     * jest parzysta czy nieparzysta
     */
    private static void zadanie7() {
        System.out.println();
        System.out.println("Zadanie 7");

        int liczba = 34567;
        switch (liczba % 2) {
            case 0:
                System.out.println("Liczba " + liczba + " jest parzysta");
                break;
            case 1:
                System.out.println("Liczba " + liczba + " jest nieparzysta");
                break;
            default:
                System.out.println("Coś poszło nie tak");
                break;
        }
    }
}
