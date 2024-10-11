import Task1.*;
import Task2.*;
import Task3.*;
import Task4.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task4Test();
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
    private static void task3Test(){
        OuterClass outerClass = new OuterClass();// Оскільки звичайний внутрішній клас прив'язаний до екземпляра - створюється екземпляр
        OuterClass.InnerClass inner = outerClass.new InnerClass();
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        inner.print();
        staticInner.print();
    }
    private static void task4Test(){
        OuterClassForLocal outerClassForLocal = new OuterClassForLocal();// Оскільки звичайний внутрішній клас прив'язаний до екземпляра - створюється екземпляр
        outerClassForLocal.method();


    }
}