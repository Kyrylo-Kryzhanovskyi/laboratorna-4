package Task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private int age;
    private HashMap<String, ArrayList<Integer>> marks;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.marks = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getMarks() {
        StringBuilder str = new StringBuilder();
        for(String i: marks.keySet())
            str.append("Subject ").append(i).append("-> marks: ").append(marks.get(i)).append("\n");
        return str.toString();
    }
    public void addMark(String subject, int mark) {
        if(!marks.containsKey(subject)) marks.put(subject, new ArrayList<>());
        marks.get(subject).add(mark);
    }
    public void removeMark(String subject, int mark) {
        marks.get(subject).remove(mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
