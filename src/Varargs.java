public class Varargs {

    void method(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public static void main(String... args) {
        Varargs varargs = new Varargs();
        Object[] objs = { "ala ma tkota", "kot ma alę" };
        varargs.method(objs, "");

        varargs.method();
        varargs.method("ala ma kota");
        varargs.method("ala ma kota", "kot ma alę");
        varargs.method(new Integer(5), new Double(5.5), new Prostokat(4, 5));
    }
}
