package com.academy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DemoCourse {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Teacher1", 500);
        Teacher teacher2 = new Teacher("Teacher2", 800);

        Student student1 = new Student("Student1", Map.of(NameCourseEnum.BASH, 3.5));
        Student student2 = new Student("Student2", Map.of(NameCourseEnum.HAMILTON_C_SHELL, 5.5));
        Student student3 = new Student("Student3", Map.of(NameCourseEnum.HASKELL, 4.5));
        Student student4 = new Student("Student4", Map.of(NameCourseEnum.BASH, 5.5, NameCourseEnum.HAMILTON_C_SHELL, 4.3));
        Student student5 = new Student("Student5", Map.of(NameCourseEnum.BASH, 6.0, NameCourseEnum.HASKELL, 5.3));
        Student student6 = new Student("Student6", Map.of(NameCourseEnum.HAMILTON_C_SHELL, 3.5, NameCourseEnum.HASKELL, 4.3));
        Student student7 = new Student("Student7", Map.of(NameCourseEnum.BASH, 5.5, NameCourseEnum.HAMILTON_C_SHELL, 4.3, NameCourseEnum.HASKELL, 3.6));

        List<Student> courseStudentBash = Arrays.asList(student1, student4, student5, student7);
        Course course1 = new Course(teacher1, NameCourseEnum.BASH, courseStudentBash, 6);

        List<Student> courseStudentHaskell = Arrays.asList(student3, student5, student6, student7);
        Course course2 = new Course(teacher1, NameCourseEnum.HASKELL, courseStudentHaskell, 8);

        List<Student> courseStudentHamilton = Arrays.asList(student2, student4, student6, student7);
        Course course3 = new Course(teacher2, NameCourseEnum.HAMILTON_C_SHELL, courseStudentHamilton, 10);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7);
        List<Course> courses = Arrays.asList(course1, course2, course3);
        List<Teacher> teachers = Arrays.asList(teacher1, teacher2);

        DataCenterImpl dataCenter = new DataCenterImpl(students, courses, teachers, courseStudentBash, courseStudentHaskell, courseStudentHamilton);

        for (Student student : students) {
            if (student.avrScoreStudent() == dataCenter.findTopStudent()) {
                System.out.println("Top student is: " + student.getNameStudent() + " with " + dataCenter.findTopStudent());
            }
        }

        for (Course course : courses) {
            if (course.getTimeCourse() == dataCenter.longestCourse()) {
                System.out.println("Longest course is: " + course.getNameCourse().label);
            }
        }
        System.out.println("Course with most excellent students is: " + dataCenter.courseMostExcellentStudents().label);
        System.out.println("Course with max avg score is: " + dataCenter.courseMaxAvgScore().label);

        System.out.println("Teacher with most students is: " + dataCenter.teacherMostStudents());

        for (Teacher teacher : teachers) {
            if (teacher.getSalary() == dataCenter.teacherBiggestSalary()) {
                System.out.println("Teacher with biggest salary is: " + teacher.getNameTeacher());
            }
        }
    }
}

