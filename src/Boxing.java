import java.util.Arrays;

public class Boxing {

    public static void main(String[] args) {

        Byte b = (byte) 1;

        byte b2 = b;
        Integer[] values = { 1, 2, 3, 4};

        Boxing boxing = new Boxing();
        boxing.method(values);

        System.out.println(Arrays.toString(values));

        Integer i = 10;
        boxing.method(i);

        System.out.println(i);
    }

    void method(Integer[] values) {
        values[0] = -1;
    }

    void method(Integer i) {
        i = 4;
    }
}
