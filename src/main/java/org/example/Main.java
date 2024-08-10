package org.example;

public class Main {

    public static void main(String[] args) {
        Principal principal = Principal.getInstance();
        Teacher teacher = new Teacher("John", 400);
        Student student = new Student("Jane");
        System.out.println("Student level: " + student.getLevel());

        TeacherServiceInterface teacherService = new TeacherServiceInterfaceImpl();
        teacherService.promoteStudent(teacher, student);
        System.out.println("Student level: " + student.getLevel());

    }
}