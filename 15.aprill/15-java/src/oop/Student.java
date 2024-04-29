package oop;

public class Student {
    private String name;
    private String university;
    private boolean islazy;
    
    public Student(String name, String university, boolean islazy) {
        this.name = name;
        this.university = university;
        this.islazy = islazy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIslazy() {
        return islazy;
    }

    public void setIslazy(boolean islazy) {
        this.islazy = islazy;
    }

    public void doHomeWork() {
        if (this.islazy) {
            System.out.println("Homework? I have TV shows to watch.");
        } else {
            System.out.println("Homework is done");
        }
    }
    
    public void switchUniversity(String school) {
        System.out.printf(String.format("%s leaves %s and starts studying in %s\n", name, this.university, school ));
        this.university = school;
    }
}
