package Ex22.Ex04;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sinh viên: " + name + " | Tuổi: " + age + " | Điểm: " + score;
    }
}
