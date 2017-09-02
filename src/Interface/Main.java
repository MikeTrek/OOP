package Interface;

public class Main {
    public static void main(String[] args) {
       Cat cat = new Cat();
       Dog dog = new Dog();
       outSay(cat);
       outSay(dog);
    }

    public static void outSay(Animal voise) {
        voise.say();
    }

    }

