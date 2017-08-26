package app;

import app.mycat.Cat;
import app.mydog.Dog;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Animals {

    static Cat cat = new Cat(); //instance of an objec
    static Dog dog = new Dog();

    public static  void main(String[] args){

        System.out.print("Кот говорит: ");
        cat.say();
        System.out.print("Собака говорит: ");
        dog.say();



    }



}
