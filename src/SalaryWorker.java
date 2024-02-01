public class SalaryWorker extends Worker {
    //Attributes
    double annualSalary;
    //Constructor
    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, Double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    //CalculateWeeklyPay
    @Override
    double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary/52;
    }

    //DisplayWeeklyPay
    @Override
    public String displayWeeklyPay(double hoursWorked) {
        String weeklyPay = String.format("%.2f", calculateWeeklyPay(0));
        return weeklyPay;
    }
}