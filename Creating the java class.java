import java.util.*;
public class Student {
    String name;
    int id;
    String major;
    int gpa;
static void displayInfo(){
    System.out.println("Study well");
}
public Student(String n, int i, String m, int g){
    name=n;
    id=i;
    major=m;
    gpa=g;
}
    public static void main(String[] args) {
        Student s=new Student("Artem",230106020,"IT",4);
        System.out.println(s.name+" "+s.id+" "+s.major+" "+s.gpa);
        displayInfo();
    }
}
