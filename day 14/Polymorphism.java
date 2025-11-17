public class Polymorphism {
    class Calculator {
        int sum(int a, int b) { //YE FN. HAI BUDDY
            return a+b; //return type se fark nhi padta:
        }

        float sum(float a, float b) {
            return a+b;
        }

        int sum(int a, int b, int c) {
            return a+b+c;
        }
    }

    class Animal {
        void eat() {
            System.out.println("eats anything");
        }
    }

    class Deer {
        void eat() {
            System.out.println("eat grass");
        }
    }

    public static void main(String[] args) {
        //method overriding:
        Polymorphism poly = new Polymorphism();//main class ka reference dene ka buddy:
        Deer d = poly.new Deer();
        d.eat();
        Animal sahil = poly.new Animal();  
        sahil.eat();
        //System.out.println(calc.sum(1,2));
        //System.out.println(calc.sum((float)1.5, (float)2.5)); //java deccimal value ko double samajh leta hai, so float ko typecast krne ka:
        //System.out.println(calc.sum(1,2,3));
    }
}