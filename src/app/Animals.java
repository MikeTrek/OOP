package app;

import app.mycat.Cat;
import app.mydog.Dog;

public class Animals {

    static Cat cat = new Cat(); //instance of an object
    static Dog dog = new Dog();

    public static  void main(String[] args){

    dog.say();
    cat.say();


    }

}
