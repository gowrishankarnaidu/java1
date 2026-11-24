public class Animal {
    String name;
     void eat(){
        System.out.println("tabu is eating");
    }
}
class Dog extends Animal{
    String breed;
    void bark(){
        System.out.println("tabu the mmmmm is barking");
    }

public static void main(String[] args){
    Dog d=new Dog();
    d.name="tabu";
    d.eat();
    d.breed="mmmmm";
    d.bark();
}
}