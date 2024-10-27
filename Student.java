import java.util.*;
public class Student {
    private String name;
    private int id;
    private String major;
    private double gpa;  
    public Student(String name, int id, String major, double gpa) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getMajor() {
        return major;
    }
    public double getGpa() {
        return gpa;
    }
    public static void displayInfo() {
        System.out.println("Study well");
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Major: " + major + ", GPA: " + gpa);
    }
}
