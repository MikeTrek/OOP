package app.mydog;

import javafx.scene.shape.Circle;

import java.math.RoundingMode;

public class Figure {

    public static void main(String[] args) {

        Form square = new Square(5);
        square.area();

        Circl circl = new Circl(5,2);
        circl.area();
    }
}
    abstract class Form {
        abstract void area();
        }

    class Square extends Form {
        int n;

        public Square(int n) {
            this.n = n;
        }

        @Override
        void area() {
            System.out.println("Площадь квадрата " + n * n);
        }
    }

        class Circl extends Square {
            int r;

            public Circl(int n, int r) {
                super(n);
                this.r = r;
            }

            @Override
            void area() {
                System.out.println("Площадь круга: "+ String.format("%.2f", Math.PI * r * r));


            }
        }
