package com.academy;

import java.util.List;

public class Course {
    private Teacher teacher;
    private NameCourseEnum nameCourse;
    private List<Student> student;
    private int timeCourse;

    public Course(Teacher teacher, NameCourseEnum nameCourse, List<Student> student, int timeCourse) {
        this.teacher = teacher;
        this.nameCourse = nameCourse;
        this.student = student;
        this.timeCourse = timeCourse;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public NameCourseEnum getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(NameCourseEnum nameCourse) {
        this.nameCourse = nameCourse;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getTimeCourse() {
        return timeCourse;
    }

    public void setTimeCourse(int timeCourse) {
        this.timeCourse = timeCourse;
    }

}

