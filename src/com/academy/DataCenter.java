package com.academy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface DataCenter {

    Double findTopStudent();

    Integer longestCourse();

    NameCourseEnum courseMostExcellentStudents();

    NameCourseEnum courseMaxAvgScore();

    String teacherMostStudents();

    Integer teacherBiggestSalary();

}
