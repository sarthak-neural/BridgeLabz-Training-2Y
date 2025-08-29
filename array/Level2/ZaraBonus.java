import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking input
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            double yrs = sc.nextDouble();

            // Validation
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--; // repeat this index
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print results
        System.out.println("\n--- Zara Bonus Report ---");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }
        System.out.println("-------------------------------------");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
