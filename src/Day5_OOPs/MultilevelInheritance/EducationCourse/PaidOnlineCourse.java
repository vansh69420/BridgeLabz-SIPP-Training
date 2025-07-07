package Day5_OOPs.MultilevelInheritance.EducationCourse;

public class PaidOnlineCourse extends OnlineCourse {
    private double fees;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fees = fees;
        this.discount = discount;
    }
}