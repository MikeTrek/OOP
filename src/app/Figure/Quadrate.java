package app.Figure;

public class Quadrate extends Shape {

    private double a;

    public Quadrate(double a) {
        this.a = a;
    }

    @Override
    public double square() {
        return a*a ;
    }

    @Override
    public double perimetr() {
        return 0;
    }

}
