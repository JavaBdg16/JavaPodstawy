package zadania;

public class Zadanie23 {

    static int binarySearch(int[] tab, int searchNumber) {

        // [1, 3, 5, 7, 8, 9, 11, 13, 15]
        // 9

        // poczatek_index = 0
        // koniec_index = tab.length - 1 = 8
        // srodek_index = (koniec_index + poczatek_index) / 2 = 4
        // tab[4] = 8

        // if (tab[4] == 9) return 4; false bo tab[4] = 8
        // else
        // if (tab[4] > 9) false 8 nie jest > 9
        // if (tab[4] < 9) true 8 jest < 9
        // poczatek_index = srodek_index + 1

        // srodek_index = (koniec_index + poczatek_index) / 2 = (8 + 5) / 2 = 6
        // tab[6] = 11

        // if (tab[6] == 9) return 6; false bo tab[6] = 11
        // else
        // if (tab[6] > 9) true 11 > 9
        // poczatek_index bez zmian
        // koniec_index = srodek_index - 1 = 5

        // srodek_index = (koniec_index + poczatek_index) / 2 = (5 + 5) / 2 = 5
        // tab[5] = 9

        // if tab[5] == 9 return 5; true bo tab[5] = 9

        int poczatekIndex = 0;
        int koniecIndex = tab.length - 1;

        while (true) {

            if (koniecIndex < poczatekIndex) {
                return -1;
            }

            int srodekIndex = (poczatekIndex + koniecIndex) / 2;
            if (tab[srodekIndex] == searchNumber) {
                return srodekIndex;
            }

            if (tab[srodekIndex] > searchNumber) {
                koniecIndex = srodekIndex - 1;
            } else if (tab[srodekIndex] < searchNumber) {
                poczatekIndex = srodekIndex + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] tab = { 3, 6, 8, 11, 45, 47, 69, 99 };
        System.out.println(binarySearch(tab, 3));
        System.out.println(binarySearch(tab, 6));
        System.out.println(binarySearch(tab, 8));
        System.out.println(binarySearch(tab, 11));
        System.out.println(binarySearch(tab, 45));
        System.out.println(binarySearch(tab, 47));
        System.out.println(binarySearch(tab, 69));
        System.out.println(binarySearch(tab, 99));
        System.out.println(binarySearch(tab, 10));
    }
}
