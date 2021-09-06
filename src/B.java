public class B extends A {

    @Override
    void print() {
        super.print();
        System.out.println("B");
    }

    @Override
    void oddychaj() {
        super.oddychaj();
        System.out.println("oddycham pod wodą");
    }

    public static void main(String[] args) {
        A b = new B();
        b.oddychaj();
    }
}
