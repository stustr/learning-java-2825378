public class StudentProfile{
    String firstName;
    String lastName;
    int expGradYear;
    double GPA;
    String Major;
    
    public StudentProfile(String firstName, String lastName, int expGradYear, double GPA, String Major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expGradYear = expGradYear;
        this.GPA = GPA;
        this.Major = Major;
    }
    
    public void incGradYear() {
        this.expGradYear = this.expGradYear + 1;
    }
}