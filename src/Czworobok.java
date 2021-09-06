import java.util.Objects;

public abstract class Czworobok {

    private double bokA, bokB, bokC, bokD;

    public Czworobok(double bokA, double bokB, double bokC, double bokD) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.bokD = bokD;
    }

    double obliczObwod() {
        return bokA + bokB + bokC + bokD;
    }

    abstract double obliczPole();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Czworobok czworobok = (Czworobok) o;
        return Double.compare(czworobok.bokA, bokA) == 0 &&
                Double.compare(czworobok.bokB, bokB) == 0 &&
                Double.compare(czworobok.bokC, bokC) == 0 &&
                Double.compare(czworobok.bokD, bokD) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bokA, bokB, bokC, bokD);
    }
}
