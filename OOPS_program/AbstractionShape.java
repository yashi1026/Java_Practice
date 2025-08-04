abstract class Shape{
    abstract double area();
    void show(){
        System.out.println("Calculating area...");
    }
}
class Circle extends Shape{
    double radius;
     Circle(double r){
        this.radius=r;
     }
     double area(){
        return Math.PI*radius*radius;
     }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    double area(){
        return length*width;
    }
}
public class AbstractionShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.show();
        System.out.println("Circle area : "+circle.area());
        Shape rectangle = new Rectangle(4,6);
        rectangle.show();
        System.out.println("Rectangle area : "+rectangle.area());

    }
}
