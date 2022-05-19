package com.academy;

public class Teacher {

    private String nameTeacher;
    private int salary;

    public Teacher(String nameTeacher, int salary) {
        this.nameTeacher = nameTeacher;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }
}
