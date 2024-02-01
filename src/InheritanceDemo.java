import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Add workers and salary workers to the ArrayList
        workers.add(new Worker("John", "Johnson", "000001", "Mr.", 1975, 27.50));
        workers.add(new Worker("Hank", "Hill", "000002", "Sr.", 1985, 29.50));
        workers.add(new Worker("Nicole", "Makras", "000003", "Mrs.", 1971, 22.60));
        workers.add(new SalaryWorker("Sarah", "Connor", "000004", "Ms.", 1995, 26.75, 53500));
        workers.add(new SalaryWorker("Kevin", "Reid", "000005", "Mr.", 1999, 22.25, 44500));
        workers.add(new SalaryWorker("Logan", "Heart", "000006", "Mr.", 1982, 45.00, 90000));

        // Simulate three weeks and display weekly pay
        for (int i = 1; i <= 3; i++) {
            if(i == 2)
            {
                System.out.println("Week " + i +":");
                for (Worker weeklyWorker : workers)
                {

                    System.out.print("Employee ID: " + weeklyWorker.getID() + " - ");
                    System.out.println(weeklyWorker.displayWeeklyPay(50));
                }
            } else
            {
                System.out.println("Week " + i +":");
                for (Worker weeklyWorker : workers)
                {
                    System.out.print("Employee ID: " + weeklyWorker.getID() + " - ");
                    System.out.println(weeklyWorker.displayWeeklyPay(40));
                }
            }
            System.out.println();
        }

    }
}