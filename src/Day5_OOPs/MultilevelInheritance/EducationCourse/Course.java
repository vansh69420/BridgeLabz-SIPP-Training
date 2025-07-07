package Day5_OOPs.MultilevelInheritance.EducationCourse;

public class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}