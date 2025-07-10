package UniversityCourseEnrollment;


public class Faculty implements Graded {
    private String name;
    public Faculty(String name) { this.name = name; }
    @Override
    public void assignGrade(Enrollment enrollment, String grade) {
        enrollment.setGrade(grade);
    }
    
    public String getName() {
    	return name;
    }
}
