package org.example;

public class Teacher extends Human{
    private boolean sacked;

    private double salary;

    public Teacher(String name, double salary) {
        super(name, Role.Teacher);
        this.salary = salary;
        this.sacked = false;
    }

    @Override
    public void printResponsibility() {
        System.out.println("I am a teacher. I am here to teach.");
    }

    public void sack() {
        sacked = true;
    }

    public void raiseSalary() {
        salary = salary * 1.1;
    }

    public boolean isSacked() {
        return sacked;
    }

    public void setSacked(boolean sacked) {
        this.sacked = sacked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
