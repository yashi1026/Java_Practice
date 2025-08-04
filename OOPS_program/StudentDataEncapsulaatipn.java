class Student{
    String name;
    int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
      if(age>0){
        this.age=age;
    }
    else{
        System.out.println("Invalid age!");
    }
  }
}
public class StudentDataEncapsulaatipn {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Yashi");
        s.setAge(21);
        System.out.println("Name: "+s.getName());
        System.out.println("Age: "+s.getAge());
    }
}
