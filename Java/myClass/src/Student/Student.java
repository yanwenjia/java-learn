package Student;

public class Student {
    private String name;
    private int age;
    /*public void setName(String na){
        name = na;
    }*/
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+" , "+age);
    }
}
