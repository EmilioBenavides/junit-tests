package test;

import static org.junit.Assert.*;

import main.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class StudentTest {

    Student Maddie = new Student(786992, "Maddie");
    double aStudent = 0;

    @Before
            public void setUp() {
        Maddie.addGrade(99);
        Maddie.addGrade(96);
        Maddie.addGrade(96);
        aStudent = Maddie.getGradeAverage();
    }
    @Test
    public void TestGetId() {
        assertEquals(786992, Maddie.getId());
    }

    @Test
    public void TestGetName() {
        assertEquals("Maddie", Maddie.getName());
    }

    @Test
    public void TestAddGrade() {
        assertEquals(99, Maddie.getGrades().get(0).intValue());
    }

    @Test
    public void TestGetGrades() {
        ArrayList<Integer> gradeList = new ArrayList<>();
        gradeList.add(99);
        gradeList.add(96);
        gradeList.add(96);
        assertEquals(gradeList, Maddie.getGrades());
    }

    @Test
    public void TestGetGradeAverage() {
        assertEquals(97, aStudent, 0);
    }
}




