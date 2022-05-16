package com.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
    private String nameStudent;
    private Map<NameCourseEnum, Double> courseGrade;

    public Student(String nameStudent, Map<NameCourseEnum, Double> courseGrade) {
        this.nameStudent = nameStudent;
        this.courseGrade = courseGrade;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Map<NameCourseEnum, Double> getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(Map<NameCourseEnum, Double> courseGrade) {
        this.courseGrade = courseGrade;
    }

    public double avrScoreStudent() {
        List<Double> avrScore = new ArrayList<>();

        double result = 0;
        int buffer = 0;
        for (NameCourseEnum courseEnum : courseGrade.keySet()) {
            avrScore.add(courseGrade.get(courseEnum));
        }
        for (int i = 0; i < avrScore.size(); i++) {
            buffer++;
            result += avrScore.get(i);
        }
        return result / buffer;
    }

}
