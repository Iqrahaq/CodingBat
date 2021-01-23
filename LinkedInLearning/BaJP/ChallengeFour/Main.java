package BaJP.ChallengeFour;

public class Main {

    public static void main(String[] args) {
        Student studentA = new Student("John", "Smith", 2021, 2.0, "History");
        Student studentB = new Student("Jane", "Doe", 2021, 4.0, "Mathematics");

        studentA.incrementGraduationYear();
        System.out.println(studentA.firstName + " " + studentA.lastName + "'s Graduation Year: " + studentA.graduationYear);
        System.out.println(studentB.firstName + " " + studentB.lastName + "'s Graduation Year: " + studentB.graduationYear);

    }

}
