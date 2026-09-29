package Zadachnik;

public class Decimal {
    private int enumerator;
    private int determiner;

    public Decimal(int enumerator, int determiner) {
        this.enumerator = enumerator;
        this.determiner = determiner;
    }

    static public Decimal mul(Decimal a, Decimal b) {
        return new Decimal(
                a.enumerator * b.enumerator,
                a.determiner * b.determiner);
    }

    public void relax() {
        boolean relaxed = true;

        while (relaxed) {
            if (enumerator % determiner == 0) {

            }

            if (determiner % enumerator == 0) {

            }
        }
    }

    @Override
    public String toString() {
        return enumerator + "/" + determiner;
    }
}
