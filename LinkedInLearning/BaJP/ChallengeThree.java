package BaJP;

public class ChallengeThree {

    public static double calculateEmployeeSalary(double hoursPerWeek, double ratePerHour, double vacationDays){

        if (hoursPerWeek < 0) {
            return -1;
        }
        if (ratePerHour < 0){
            return -1;
        }

        double vacationRate = vacationDays * ratePerHour * 8;
        double ratePerWeek = ratePerHour * hoursPerWeek;
        double ratePerYear = (ratePerWeek * 52) - vacationRate;
        return ratePerYear;
    }

    public static void main(String[] args) {
        double employeeSalary = calculateEmployeeSalary(40, 15, 8);
        System.out.println(employeeSalary);
    }
}
