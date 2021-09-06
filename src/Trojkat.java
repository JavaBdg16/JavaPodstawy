public class Trojkat {

    private double bokA, bokB, bokC;

    public Trojkat() {
        bokA = 3;
        bokB = 4;
        bokC = 5;
    }

    public double obliczPole() {
        double p = obliczObwod() / 2;
        return Math.sqrt(p * (p - bokA) * (p - bokB) * (p - bokC));
    }

    public double obliczObwod() {
        return bokA + bokB + bokC;
    }
}
