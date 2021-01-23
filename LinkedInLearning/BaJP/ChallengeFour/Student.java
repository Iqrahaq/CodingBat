package BaJP.ChallengeFour;

public class Student {
    String firstName;
    String lastName;
    int graduationYear;
    double GPA;
    String major;

    public Student(String firstName, String lastName,
                   int graduationYear, double GPA,
                   String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.GPA = GPA;
        this.major = major;
    }

    public void incrementGraduationYear(){
        this.graduationYear += 1;
    }
}
