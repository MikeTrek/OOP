package app.Figure;

public class Main {
    public static void main(String[] args) {
        Shape quadrate = new Quadrate(5);
        Shape circle = new Circle(10);

        System.out.println("Площадь квадрата: " + quadrate.square());
        System.out.println("Длина круга: " + Math.rint(circle.perimetr()*100)/100);

    }
}
