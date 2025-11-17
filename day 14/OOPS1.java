import java.util.*;
public class OOPS1 {

    //inheritance ; this is multi level inheritance:
    
    class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    class Mammal extends Animal {
        void walk() {
            System.out.println("walks");
        }
    }

    class Fish extends Animal {
        void swim();
        System.out.println("swim")
    }

    class Bird extends Animal {
        void fly() {
            System.out.println("fly");
        }
    }

    public static void main(String args[]) {
        OOPS1 inheritance = new OOPS1();  //class ko refrence nhi kiya tha to error aa rha tha;
        Dog Loofy = inheritance.new Dog();
        Loofy.eat();
        Loofy.legs = 4;
        System.out.println(Loofy.legs);

    }

    //hybbrid inheritance solve:
}