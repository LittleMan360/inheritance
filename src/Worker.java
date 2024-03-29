public class Worker extends Person{

    //Attributes
    Double hourlyPayRate;

    //Constructor
    public Worker(String firstName, String lastName, String ID, String title, int YOB, Double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }


    //CalculateWeeklyPay
    double calculateWeeklyPay(double hoursWorked)
    {
        Double Regular;
        Double OverTime;

        if (hoursWorked > 40)
        {
            Regular =  hoursWorked * hourlyPayRate;
            OverTime = (hoursWorked - 40) * hourlyPayRate * 1.5;
            hoursWorked = 40;

            return OverTime + Regular;

        }
        else
        {
            Regular =  hoursWorked * hourlyPayRate;
            return Regular;
        }
    }



    ////DisplayWeeklyPay

    public String displayWeeklyPay(double hoursWorked){
        if (hoursWorked > 40)
            return "Weekly pay: " + (hoursWorked * hourlyPayRate) + "\n" + "Overtime Pay: " + ((hoursWorked-40)*(hourlyPayRate*1.5));
        else
            return "Weekly pay: " + (hoursWorked * hourlyPayRate);
    }


}