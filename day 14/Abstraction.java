public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        Chicken c = new Chicken();
        c.eat();


    }
}

abstract class Animall {
    void eat() {
        System.out.println("animal eats");
    }

    //make abstarct method:
     //isme ham implementation nhi likenge vo sub class se define hoga

     abstract void walk(); //abstract fn. has no body, uskme parameters and {} mt lagao..

class Horse extends Animall { //isme mujhe walk ko implement krna pdeaga iss class ke according
    void walk() {
        System.out.println("walk on 4 legs");
    }
    
}

class Chicken extends Animall {
     void walk() {
        System.out.println("walks on 2 legs");
    }
}
