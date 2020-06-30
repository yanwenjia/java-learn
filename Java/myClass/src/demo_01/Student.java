package demo_01;

public class Student {
    String name;
    int age;
    public Student(){}
    public Student(int age){
        this.age = age;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("无参数构造方法");
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
