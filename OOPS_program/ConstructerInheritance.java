class Animal{
    Animal(){
        System.out.println("Animal constructor called.");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog constructor called.");
    }
}
public class ConstructerInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
