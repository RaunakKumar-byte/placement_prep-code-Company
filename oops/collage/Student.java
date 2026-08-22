package collage;

    abstract class Animal{
        void eat(){
            System.out.println("Animal is eating");
        }

        abstract void walk();
    }

    class Horse extends Animal{
        void walk(){
            System.out.println("Walks on 4 legs");
        }
    }

    class Chicken extends Animal{
        void walk(){
            System.out.println("Walks on 2 legs");
        }
    }

    // class Dog extends Animal{
    //     void bark(){
    //         System.out.println("Dog is barking");
    //     }
    // }
    // class puppy extends Dog{
    //     void bark(){
    //         System.out.println("Dog baby is barking");
    //     }
    // }

public class Student {

    public int marks = 95;

    protected int age = 20;
    int rollNo = 24373;
    String name;

    Student(){
        System.out.println("No data");
    }
    Student(int rollNo, String name){        
        this.rollNo=rollNo;
        this.name=name;

    }
     private String password = "abcd1234";
     public String getpsw(){
        return password;
     }
     public void setMarks(){
        marks=90;
     }

    public void display() {
        System.out.println("Display Method");
    }

    protected void study() {
        System.out.println("Studying...");
    }

    void attendClass() {
        System.out.println("Attending class");
    }

    private void login() {
        System.out.println("Login Successful");
    }






    public static void main(String[] args){
        // Dog d=new Dog();
        // puppy p=new puppy();
        // p.eat();
        // d.eat();
        // d.bark();
        // p.bark();

        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken ch=new Chicken();
        ch.eat();
        ch.walk();
    }
}