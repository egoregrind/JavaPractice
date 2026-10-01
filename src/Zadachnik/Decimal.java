package Zadachnik;

public class Decimal {
    private int numerator;
    private int denominator;

    public Decimal(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    static public Decimal mul(Decimal a, Decimal b) {
        Decimal res = new Decimal(
                a.numerator * b.numerator,
                a.denominator * b.denominator);

        res.relax();

        return res;
    }

    public void relax() {
        if (denominator == 0) {
            throw new ArithmeticException("Знаменатель не может быть равен нулю");
        }

        int gcd = computeGcd(Math.abs(numerator), Math.abs(denominator));

        numerator /= gcd;
        denominator /= gcd;
    }

    private int computeGcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
