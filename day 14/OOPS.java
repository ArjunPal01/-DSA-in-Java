public class OOPS {

    public static void main(String args[]) {
       Pen p1 = new Pen(); //new word se hamne memory me ek new space find kr liye:
       p1.setcolor("Blue");
         System.out.println(p1.color);

        p1.settip(5); //ye int type me hai so direct 5 likh, agar String type hota to "5" likhte:
        System.out.println(p1.tip);

        //abb fn; call na krke ase bhi kr skte hai
        p1.color = "Yellow";
        System.out.println(p1.color);

        Bankaccount myAcc = new Bankaccount();
        myAcc.username = "Arjun";
        myAcc.password = "Arjun@1234";
        System.out.println(myAcc.username);
        System.out.println(myAcc.password); //yaha pr ye run nhi hone wala bczz password ko hamne privarte kioya h:
        myAcc.setPassword("Arjun@12");
        System.out.println(myAcc.set Password);

        Student1 s1 = new Student1();
        s1.name = "Arjun";
        s1.roll = 123;
        s1.password = "Arjun@123";

        Student1 s2 = new Student1(s1);
        s2.password = "Aditya";  //s1 ka data s2 me copy krkke usme new password laga diiye;

        Student1 s2 = new Student1("arjun");
        Student1 s3 = new Student1(1234);

    }

}

class Bankaccount {
     public String username;
     private String password;

     void setPassword(String pwd) {
        password = pwd;
     }
}
//class ke andar class: wow amazing
class Pen { //pen ka blueprint ready kr rhe hai
    //pen ki properties:
    String color;
    int tip;

    void setcolor(String newcolor) { //fn. banane ka new way.
    color = newcolor;
}

void settip(int newtip) {
    tip = newtip;
}
}

class Student {
    String name;
    int age;
    float percentage;

    void calcpercentage(int phy, int chem, int math) {
        percentage = ( phy + chem + math)/3;
    }

    void calcage(int newage) {
        age = newage;
    }

    void name(String newname) {
        name = newname;
    }
}

//constructors:

class Student1 {
    String name;
    int roll;
    String password;
     
    Student1() { //consstructor ko initialize kr rha h:
        System.out.println("Constructor is called");
    }
    Student1(String name) {
        this.name = name;
       
    }
    Student1(int roll) {
        this.roll = roll;
    }
    //jo yaha construct krega wo hi call krne pr print hone wala hai:


    //there are 3 types of constructor:
}

//inheritence
//base class
class Animal {
    string color;

    void eat() {
        System.out.println("beathes");
    }
}

//derived class
class Fish extends Animal {

}
//next:

