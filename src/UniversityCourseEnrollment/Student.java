package UniversityCourseEnrollment;


public class Student {
    private String name;
    private int id;
    private double gpa = 0.0; 

    public Student(String name, int id) {
    	this.name = name;
    	this.id = id;
    }
    
    public double getGPA() {
    	return gpa;
    }
    
    public String getTranscript() {
    	return "Student: " + name + ", GPA; " + gpa;
    }
    
    public int getID() {
    	return id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void updateGPA(double totalPoints, double totalCourses) {
    	this.gpa = totalCourses > 0 ? totalPoints / totalCourses : 0.0;
    }
    
}
