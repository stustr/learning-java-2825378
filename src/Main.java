public class Main {

    public static double calc_salary(double weeklyHours, double hourlyRate, int vacationDays) {
        if (hourlyRate < 0) {
            return -1;
        }
        
        if (weeklyHours < 0) {
            return -1;
        }
        
        double weeklyWage = weeklyHours * hourlyRate;
        double vacationDeduction = vacationDays * hourlyRate * 8;
        double salary = weeklyWage * 52 - vacationDeduction;
        return salary;
    }

    public static void main(String[] args) {
        System.out.println(calc_salary(40, 10, 0));
    }
}