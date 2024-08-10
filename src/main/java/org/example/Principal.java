package org.example;

public class Principal extends Human {

    // Singleton pattern
    private static Principal instance;

    private Principal() {
        super("Sammy", Role.Principal);
    }

    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }

    @Override
    public void printResponsibility() {
        System.out.println("I am a principal. I am responsible for the school.");
    }
}
