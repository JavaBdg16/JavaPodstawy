package recursion;

public class Math {

    public int silnia(int n) {

        // przypadek elementarny
        if (n == 1) return n;

        // przypadek złożony
        // 5| = 4| * 5
        return silnia(n - 1) * n;

//        int result = 1;
//        while (n > 1) {
//            result = result * n;
//        }

//        return result;

    }



    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.silnia(5));
    }
}
