package ngquocth;
import java.util.Scanner;

public class TestEarning {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        Employee [] e = new Employee[4];


        for (int i = 0; i < 4; i++) {
            System.out.println("Press 1 for Hourly Employee/ 2 for Salaried Employee");
            int select = input.nextInt();

            if (select == 1) {
                System.out.println("*Information for Hourly Employee:");
                System.out.print("Enter Employee's ID: ");
                String ID = input.next();
                System.out.print("Enter Employee's Name: ");
                String NAME = input.next();
                System.out.print("Hours per week (must be greater or equal 10 hours): ");
                int hourPerW = input.nextInt();
                System.out.print("Hourly rate (must be greater or equal 15 and less than or equal 100): ");
                double hourRate = input.nextDouble();
                e[i] = new Hourly_emp(ID, NAME, hourPerW, hourRate);
                System.out.println();
            } else if (select == 2) {
                System.out.println("*Information for Salaried Employee:");
                System.out.print("Enter Employee's ID: ");
                String ID = input.next();
                System.out.print("Enter Employee's Name: ");
                String NAME = input.next();
                System.out.print("Monthly Salary (must be greater or equal 1000): ");
                int M_salary = input.nextInt();
                e[i] = new Salaried_emp(ID, NAME, M_salary);
                System.out.println();
            } else{
                throw new IllegalArgumentException("Incorrect input. Try again!");}
        }

        //Display results
        System.out.println("  ID" + "\t\t" + "Name" + "\t\t\t" + "Employee Category" + "\t\t" + "Monthly Salary ($)" +"\t" + "Vacation Days");
        for (Employee employee : e){
            System.out.println(employee);
        }


    }
}
