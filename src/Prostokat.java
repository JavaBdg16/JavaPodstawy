public class Prostokat extends Czworobok {

    private double bokA;
    private double bokB;

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }



    public Prostokat(double bokA, double bokB) {
        super(bokA, bokB, bokA, bokB);
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double obliczPole() {
        return bokA * bokB;
    }

    public static void main(String... args) {
        Prostokat prostokat1 = new Prostokat(-3, 4);
        System.out.println(prostokat1.obliczObwod());
        System.out.println(prostokat1.obliczPole());

        prostokat1.setBokA(10);
        System.out.println(prostokat1.obliczObwod());
        System.out.println(prostokat1.obliczPole());

        Prostokat prostokat2 = new Prostokat(5, 10);
//        System.out.println(prostokat2.obliczObwod());
//        System.out.println(prostokat2.obliczPole());
    }
}
