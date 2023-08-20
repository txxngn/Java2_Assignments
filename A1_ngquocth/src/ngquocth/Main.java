package ngquocth;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        //Prompt user for input data
        System.out.println("Enter an employee name: ");
        String name = input.nextLine();
        System.out.println("Enter employee ID: ");
        String id = input.nextLine();
        System.out.println("Enter number of years: ");
        int NumOfYears = input.nextInt();
        System.out.println("Enter monthly salary $: ");
        double MonthlySalary = input.nextDouble();
        input.nextLine();


        //prompt boolean for manager
        System.out.println("Is this employee is a Manager? true/false");
        boolean manager;
        while (true){
            String checkManager = input.nextLine();
            if (checkManager.equalsIgnoreCase("true")){
                manager = true;
                break;
            } else if (checkManager.equalsIgnoreCase("false")) {
                manager = false;
                break;
            }
            else
                System.out.println("Invalid input. Please enter \"true\" or \"false\" ");
        }

        //first employee
        Employee e = new Employee();
        e.setName(name);
        e.setId(id);
        e.setNumOfYears(NumOfYears);
        e.setMonthlySalary(MonthlySalary);
        e.setManager(manager);

        //2 left employees with another setup way
        Employee e2 = new Employee("102", "Jack", 2, 3000, false);
        Employee e3 = new Employee("205", "Diana", 6, 7000, true);

        System.out.println(e);
        System.out.println();
        System.out.println(e2);
        System.out.println();
        System.out.println(e3);




    }
}
