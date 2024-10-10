import Task1.*;
import Task2.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task2Test();
    }
    private static void task1Test(){
        Student student1 = new Student("Jane Doe", 23);
        student1.addMark("Math", 12);
        student1.addMark("English", 10);
        student1.addMark("English", 9);
        student1.addMark("Math", 8);
        System.out.print(student1.getMarks());
        System.out.println(student1.getName());
        System.out.println(student1);
    }
    private static void task2Test(){
        Task2 task2 = new Task2();
        Student student = new Student("Kyrylo", 18);
        int i =1;
        String s = "fasfad";
        char c = s.charAt(0);
        System.out.println("З явним завданням п'яти різних параметрів");
        task2.printParameters(student, s, new ArrayList<>(), i , c);
        System.out.println("через масив object[]");
        task2.printParameters(new Object[]{student, s, new ArrayList<>(), i , c});
        System.out.println("через масив varargs");
        task2.printParameters1(student, s, new ArrayList<>(), i);
    }
}