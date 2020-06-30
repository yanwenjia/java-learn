package demo_02;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("老马");
        s1.setAge(30);
        s1.show();
        Student s2 = new Student("老王",20);
        s2.show();
    }
}
