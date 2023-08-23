package ngquocth;

import java.util.Scanner;

public abstract class Employee implements Earning{
    private String id;
    private String name;
    public abstract int vacationDays(); //abstract method (nobody)



    //abstract class can have normal methods with body

    public Employee(String ID, String NAME){
        setId(ID);
        setName(NAME);
    }


    //-	Use the methods of your employee class to ensure that the user's input is valid.
    // If any input is not valid, repeatedly prompt the user to enter data until that data is valid.

    Scanner input = new Scanner(System.in);
    public void setId(String ID) {
        while (true) {
            if (ID == null) {
                System.out.println("Employee ID is required. Please try again!");
                ID = input.nextLine();
            } else {
                this.id = ID;
                break;
            }
        }
    }

    public String getId(){
        return id;
    }

    public void setName(String NAME) {
        while (true) {
            if (NAME == null) {
                System.out.println("Employee Name is required. Please try again!");
                NAME = input.nextLine();
            }
            else {
                this.name = NAME;
                break;
            }
        }
    }


    public String getName(){
        return name;
    }


    //toString() method check if object is hourly or salary employee
    public String toString(){
        String Emp_Category;
        if (this instanceof Hourly_emp){
            Emp_Category = "Hourly Employee";
        }
        else
            Emp_Category = "Salary Employee";

        return id + "\t\t" + name + "\t\t\t" + Emp_Category + "\t\t\t" + earnPerMonth() +"\t\t\t\t" + vacationDays();
    }



}
