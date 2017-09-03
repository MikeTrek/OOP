package app.Figure;

public class Circle extends Shape {

    private double d;

    public Circle(double d) {
        this.d = d;
    }

    @Override
    public double perimetr(){
        return Math.PI*d;
    }

    @Override
    public double square(){
        return 0;
    }
}
