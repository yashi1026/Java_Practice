interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog says : Woof");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Cat says : Meow!");
    }
}
public class AnimalInterface {
    public static void main(String[]args){
        Animal d=new Dog();
        Animal c=new Cat();
        d.sound();
        c.sound();
}
}
