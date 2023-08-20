package ngquocth;

public class Employee {
    private String id = "100";
    private String name = "New Employee";
    private int NumOfYears = 1;
    private double MonthlySalary = 2000;
    private boolean Manager = true;

    //Constructors
    public Employee(){

    }
    public Employee(String id, String name, int NumOfYears){
        this.id = id;
        this.name = name;
        this.NumOfYears = NumOfYears;
    }

    public Employee(String id, String name, int NumOfYears, double MonthlySalary, boolean Manager){
        this.id = id;
        this.name = name;
        this.NumOfYears = NumOfYears;
        this.MonthlySalary = MonthlySalary;
        this.Manager = Manager;
    }


    //set+get methods
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        if (Integer.parseInt(id) > 100)
            this.id = id;
        else {
            throw new IllegalArgumentException("Invalid ID, try again!");
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
            this.name = name;
    }
    public int getNumOfYears(){
        return this.NumOfYears;
    }
    public void setNumOfYears(int NumOfYears){
        if (NumOfYears >= 0) {
            this.NumOfYears = NumOfYears;
        } else {
            throw new IllegalArgumentException("Number of years cannot be negative.");
        }
    }
    public double getMonthlySalary(){
        return this.MonthlySalary;
    }
    public void setMonthlySalary(double MonthlySalary){
        if (MonthlySalary >= 2000) {
            this.MonthlySalary = MonthlySalary;
        } else {
            throw new IllegalArgumentException("INvalid Monthly salary.");
        }
    }
    public boolean getManager(){
        return this.Manager;
    }
    public void setManager(boolean Manager){
        this.Manager = Manager;
    }

    //Other methods
    public double calTotal(int NumOfYears, double MonthlySalary){
        double total_salary = NumOfYears * MonthlySalary;
        return total_salary;
    }

    public double calBonus(boolean Manager, double MonthlySalary){
        if (Manager){
            return MonthlySalary*5;
        }
        else
            return 0;
    }

    public String toString(){
        return "Employee " +getName()+" with ID "+getId()+" has: \n" +
                "Monthly Salary: " + getMonthlySalary()+ "\n" +
                "Num of Years: " + getNumOfYears() +"\n"+
                "Total Salary: " + calTotal(getNumOfYears(), getMonthlySalary()) + "\n"+
                "Bonus: " + calBonus(getManager(), getMonthlySalary())  + "\n"+
                "Manager: " + getManager();

    }



}
