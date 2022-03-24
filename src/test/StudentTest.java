package test;

import static org.junit.Assert.*;

import main.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class StudentTest {
    public static final long STUDENT_ID = 1;
    public static final String STUDENT_NAME = "tom";

    @Test
    public void getId() {
       Student Frances = new Student(210834, "Frances");
       long expected = 210834;
       long actual = Frances.getId();

       assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        Student Kobe = new Student(897634, "Kobe");
        String expected = "Kobe";
        String actual = Kobe.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void addGrade() {
        Student Howard = new Student(123451, "Howard");
        Howard.addGrade(94);
        assertEquals(94, Howard.getGrades().get(0).intValue());
    }

    @Test
    public void getGrades(){
    Student Jerry = new Student(564732, "Jerry");
    Jerry.addGrade(88);
    ArrayList<Integer> gradeList = new ArrayList<>();
    gradeList.add(88);
    assertEquals(gradeList, Jerry.getGrades());
    }

    @Test
    public void getGradeAverage(){
        Student Maddie = new Student(786992, "Maddie");
        Maddie.addGrade(99);
        Maddie.addGrade(96);
        Maddie.addGrade(96);
        double aStudent = Maddie.getGradeAverage();
        assertEquals(97, aStudent, 0);
    }

}




