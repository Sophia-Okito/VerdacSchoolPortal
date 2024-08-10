package org.example;

public abstract class Human {

    public String name;
    public Role role;

    public Human(String name, Role role) {
        this.name = name;
        this.role = role;
    }
    public abstract void printResponsibility();

    public void printDetails() {
        System.out.printf("My name is %s. I am a %s.%n", name, role.toString());
        System.out.println();
    }
}
