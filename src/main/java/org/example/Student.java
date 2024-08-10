package org.example;

enum Level {
    LEVEL_1, LEVEL_2, LEVEL_3
}

public class Student extends Human {
    private boolean graduated;

    private boolean expelled;

    private Level level;

    public Student(String name) {
        super(name, Role.Student);
        this.level = Level.LEVEL_1;
        graduated = false;
        expelled = false;
    }

    public void expel() {
        expelled = true;
    }

    public void graduate() {
        graduated = true;
    }

    public void demote() {
        if (level == Level.LEVEL_1) {
            level = Level.LEVEL_1;
        } else if (level == Level.LEVEL_2) {
            level = Level.LEVEL_1;
        } else {
            level = Level.LEVEL_2;
        }
    }

    public void promote() {
        if (level == Level.LEVEL_1) {
            level = Level.LEVEL_2;
        } else if (level == Level.LEVEL_2) {
            level = Level.LEVEL_3;
        } else {
            level = Level.LEVEL_3;
        }
    }

    @Override
    public void printResponsibility() {
        System.out.println("I am a student. I am here to learn.");
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public boolean isExpelled() {
        return expelled;
    }

    public void setExpelled(boolean expelled) {
        this.expelled = expelled;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
