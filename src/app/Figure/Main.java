package app.Figure;

public class Main {
    public static void main(String[] args) {
        Shape quadrate = new Quadrate(5);
        Shape circle = new Circle(4);

        System.out.println("Площадь квадрата: " + quadrate.square());
        System.out.println("Переметр квадрата: " + quadrate.perimetr());
        System.out.println("Длина круга: " + Math.rint(circle.perimetr()*100)/100);
        System.out.println("Площадь круга: " + Math.rint(circle.square()*100)/100);

    }
}
