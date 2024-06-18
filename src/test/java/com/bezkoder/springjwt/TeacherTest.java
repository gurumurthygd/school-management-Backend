package com.bezkoder.springjwt;

import com.bezkoder.springjwt.models.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TeacherTest {
    @Test
    public void testDefaultConstructor(){
        Teacher teacher = new Teacher();
        assertNotNull(teacher);
    }

    @Test
    public void testParameterizedConstructor() {
        Teacher teacher = new Teacher("John", "Doe", "1234567890", "Math", "Male", "1234-5678-9101", "01-01-1980", "New York", "ABCDE1234F", "A", "123 Main St");
        assertEquals("John", teacher.getfName());
        assertEquals("Doe", teacher.getlName());
        assertEquals("1234567890", teacher.getPhNo());
        assertEquals("Math", teacher.getDept());
        assertEquals("Male", teacher.getGender());
        assertEquals("1234-5678-9101", teacher.getAadhaar());
        assertEquals("01-01-1980", teacher.getDob());
        assertEquals("New York", teacher.getPlaceOfBirth());
        assertEquals("ABCDE1234F", teacher.getPan());
        assertEquals("A", teacher.getGrade());
        assertEquals("123 Main St", teacher.getAddress());
    }



}
