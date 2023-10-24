import java.util.Scanner;

public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getD() {
        return this.d;
    }

    public double getE() {
        return this.e;
    }

    public double getF() {
        return this.f;
    }

    public boolean isSolvable() {
        return (this.a * this.d - this.b * this.c) != 0;
    }

    public double getX() {
        return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
    }

    public double getY() {
        return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            System.out.println("Nilai X adalah: " + linearEquation.getX());
            System.out.println("Nilai Y adalah: " + linearEquation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
}
}
}