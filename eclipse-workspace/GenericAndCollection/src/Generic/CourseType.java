package Generic;

import java.util.*;

public abstract class CourseType {
    private String name;
    public CourseType(String name) { this.name = name; }
    public String getName() { return name; }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) { super(name); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) { super(name); }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) { super(name); }
}

class Course<T extends CourseType> {
    private T courseType;
    public Course(T courseType) { this.courseType = courseType; }
    public T getCourseType() { return courseType; }
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) System.out.println(c.getName());
    }
    public static void main(String[] args) {
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(new ExamCourse("Math Exam"));
        courseList.add(new AssignmentCourse("Java Assignment"));
        displayCourses(courseList);
    }
}