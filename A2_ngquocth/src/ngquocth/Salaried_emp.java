package ngquocth;

public class Salaried_emp extends Employee implements Earning{
    public double MonthlySalary;

    public Salaried_emp(String ID, String NAME, double M_salary){
        super(ID,NAME);
        setMonthlySalary(M_salary);
    }


    //setter + getter
    public void setMonthlySalary(double M_salary){
        if (M_salary >= 1000){
            this.MonthlySalary = M_salary;
        }
        else
            throw new IllegalArgumentException("Monthly salary must be greater or equal 1000.");
    }
    public double getMonthlySalary(){
        return MonthlySalary;
    }


    //2 return methods
    @Override
    public double earnPerMonth() {
        return MonthlySalary;
    }

    @Override
    public int vacationDays() {
        return 30;
    }
}
