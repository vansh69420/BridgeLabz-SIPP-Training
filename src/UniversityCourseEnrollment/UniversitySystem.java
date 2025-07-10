package UniversityCourseEnrollment;



public class UniversitySystem {
    public static void main(String[] args) {
        Undergraduate s1 = new Undergraduate("Vansh", 1);
        Postgraduate s2 = new Postgraduate("Suyash", 2);
        Course c1 = new Course("OOP", 101);
        Course c2 = new Course("DSA", 102);
        Faculty f1 = new Faculty("Amarendra Bahubali");

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c2);

        f1.assignGrade(e1, "A");
        f1.assignGrade(e2, "B");

        
        double totalPoints1 = 4.0; // A
        s1.updateGPA(totalPoints1, 1);
        double totalPoints2 = 3.0; // B
        s2.updateGPA(totalPoints2, 1);

        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
        System.out.println("Enrollment: " + e1.getStudent().getName() + " in " + e1.getCourse().getCourseName() + " got " + e1.getGrade() + " by " + f1.getName());
        System.out.println("Enrollment: " + e2.getStudent().getName() + " in " + e2.getCourse().getCourseName() + " got " + e2.getGrade() + " by " + f1.getName());
    }
}