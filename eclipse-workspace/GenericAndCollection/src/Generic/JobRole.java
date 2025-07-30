package Generic;

import java.util.*;

public abstract class JobRole {
    private String roleName;
    public JobRole(String roleName) { this.roleName = roleName; }
    public String getRoleName() { return roleName; }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    public DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    public ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;
    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }
    public T getJobRole() { return jobRole; }
    public String getCandidateName() { return candidateName; }
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing resumes for: " + role.getRoleName());
        }
    }
    public static void main(String[] args) {
        List<JobRole> roles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        processResumes(roles);
    }
}