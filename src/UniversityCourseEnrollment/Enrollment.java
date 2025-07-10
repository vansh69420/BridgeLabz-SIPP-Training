package UniversityCourseEnrollment;



public class Enrollment {
    private Student student;
    private Course course;
    private String grade;
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
    public void setGrade(String grade) { this.grade = grade; }
    public String getGrade() { return grade; }
    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
}