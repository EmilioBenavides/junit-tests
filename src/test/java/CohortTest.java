import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CohortTest {
    Student Willy = new Student(5463221, "Willy");
    Cohort jvTeam = new Cohort();

    @Before
            public void setUp() {
        jvTeam.addStudent(Willy);
        Willy.addGrade(87);
        Willy.addGrade(69);
        Willy.addGrade(99);
    }

    @Test
    public void testAddStudent(){
        assertEquals(1, jvTeam.getStudents().size());
    }

    @Test
    public void testGetCohortAverage(){
        assertEquals(85, jvTeam.getCohortAverage(), 0);
    }



}
