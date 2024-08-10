package org.example;

import java.io.Serializable;

public class TeacherServiceInterfaceImpl implements TeacherServiceInterface, Serializable {
    @Override
    public void promoteStudent(Teacher teacher, Student student) {
        if (teacher.role != Role.Teacher) {
            System.out.println("Only teachers can promote students.");
            return;
        }

        if (student.role != Role.Student) {
            System.out.println("Only students can be promoted.");
            return;
        }

        if (student.getLevel() == Level.LEVEL_3) {
            System.out.println("Student is already at the highest level.");
            return;
        }

        if (student.getLevel() == Level.LEVEL_1) {
            student.setLevel(Level.LEVEL_2);
        } else {
            student.setLevel(Level.LEVEL_3);
        }
    }
}
