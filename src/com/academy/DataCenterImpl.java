package com.academy;

import java.util.*;

public class DataCenterImpl implements DataCenter {
    private List<Student> students;
    private List<Course> courses;
    private List<Teacher> teacher;
    private List<Student> courseStudentBash;
    private List<Student> courseStudentHaskell;
    private List<Student> courseStudentHamilton;
    private static final double EXCELLENT_SCORE = 5.5;


    public DataCenterImpl(List<Student> students, List<Course> courses, List<Teacher> teacher, List<Student> courseStudentBash, List<Student> courseStudentHaskell, List<Student> courseStudentHamilton) {
        this.students = students;
        this.courses = courses;
        this.teacher = teacher;
        this.courseStudentBash = courseStudentBash;
        this.courseStudentHaskell = courseStudentHaskell;
        this.courseStudentHamilton = courseStudentHamilton;
    }

    @Override
    public Double findTopStudent() {
        List<Double> result = new ArrayList<>();
        for (Student student : students) {
            result.add(student.avrScoreStudent());
        }
        return Collections.max(result);
    }

    @Override
    public Integer longestCourse() {
        List<Integer> result = new ArrayList<>();
        for (Course course : courses) {
            result.add(course.getTimeCourse());
        }
        return Collections.max(result);
    }

    @Override
    public NameCourseEnum courseMostExcellentStudents() {

        NameCourseEnum resul = null;
        int countBash = 0;
        int countHaskell = 0;
        int countHamilton = 0;

        for (Student student : courseStudentBash) {
            if (student.getCourseGrade().get(NameCourseEnum.BASH) >= EXCELLENT_SCORE) {
                countBash++;
            }
        }
        for (Student student : courseStudentHaskell) {
            if (student.getCourseGrade().get(NameCourseEnum.HASKELL) >= EXCELLENT_SCORE) {
                countHaskell++;
            }
        }
        for (Student student : courseStudentHamilton) {
            if (student.getCourseGrade().get(NameCourseEnum.HAMILTON_C_SHELL) >= EXCELLENT_SCORE) {
                countHamilton++;
            }
        }
        if (countBash > countHaskell && countBash > countHamilton) {
            resul = NameCourseEnum.BASH;
        }
        if (countHaskell > countBash && countHaskell > countHamilton) {
            resul = NameCourseEnum.HASKELL;
        }
        if (countHamilton > countBash && countHamilton > countHaskell) {
            resul = NameCourseEnum.HAMILTON_C_SHELL;
        }
        return resul;
    }

    @Override
    public NameCourseEnum courseMaxAvgScore() {
        NameCourseEnum resul = null;
        double avrScoreBash = 0.0;
        double avrScoreHaskell = 0.0;
        double avrScoreHamilton = 0.0;

        for (Student student : courseStudentBash) {
            avrScoreBash += student.getCourseGrade().get(NameCourseEnum.BASH);
        }
        for (Student student : courseStudentHaskell) {
            avrScoreHaskell += student.getCourseGrade().get(NameCourseEnum.HASKELL);
        }
        for (Student student : courseStudentHamilton) {
            avrScoreHamilton += student.getCourseGrade().get(NameCourseEnum.HAMILTON_C_SHELL);
        }

        avrScoreBash /= courseStudentBash.size();
        avrScoreHaskell /= courseStudentHaskell.size();
        avrScoreHamilton /= courseStudentHamilton.size();

        if (avrScoreBash > avrScoreHaskell && avrScoreBash > avrScoreHamilton) {
            resul = NameCourseEnum.BASH;
        }
        if (avrScoreHaskell > avrScoreBash && avrScoreHaskell > avrScoreHamilton) {
            resul = NameCourseEnum.HASKELL;
        }
        if (avrScoreHamilton > avrScoreBash && avrScoreHamilton > avrScoreHaskell) {
            resul = NameCourseEnum.HAMILTON_C_SHELL;
        }
        return resul;
    }

    @Override

    public String teacherMostStudents() {
        Set<String> teacher1Students = new LinkedHashSet<>();
        Set<String> teacher2Students = new LinkedHashSet<>();
        String result = null;
        for (Course course : courses) {
            if (course.getNameCourse().equals(NameCourseEnum.BASH)) {
                for (Student i : courseStudentBash) {
                    teacher1Students.add(i.getNameStudent());
                }
            }
            if (course.getNameCourse().equals(NameCourseEnum.HASKELL)) {
                for (Student i : courseStudentHaskell) {
                    teacher1Students.add(i.getNameStudent());
                }
            }
            if (course.getNameCourse().equals(NameCourseEnum.HAMILTON_C_SHELL)) {
                for (Student i : courseStudentHamilton) {
                    teacher2Students.add(i.getNameStudent());
                }
            }
            if (teacher1Students.size() > teacher2Students.size()) {
                result = "Teacher1 with total of " + teacher1Students.size() + " students";
            } else {
                result = "Teacher2 with total of " + teacher2Students.size() + " students";
            }
        }
        return result;
    }

    @Override
    public Integer teacherBiggestSalary() {
        List<Integer> result = new ArrayList<>();
        for (Teacher teachers : teacher) {
            result.add(teachers.getSalary());
        }
        return Collections.max(result);
    }

}