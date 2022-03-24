package main;

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public double getGradeAverage() {
        if (grades == null || grades.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();

    }
}


