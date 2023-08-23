package ngquocth;

public class Hourly_emp extends Employee implements Earning{
    private int Hours_per_week;
    private double Hour_rate;

    public Hourly_emp(String ID, String NAME, int hourPerW, double hourRate){
        super (ID, NAME);
        setHours_per_week(hourPerW);
        setHour_rate(hourRate);
    }

    //setter and getter
    public void setHours_per_week(int hourPerW){
        if (hourPerW <= 10) {
            throw new IllegalArgumentException("Hours per week must be greater or equal 10 hours.");
        }
        else
            this.Hours_per_week = hourPerW;
    }
    public int getHours_per_Week(){
        return Hours_per_week;
    }

    public void setHour_rate(double hourRate){
            if (hourRate >= 15 && hourRate <= 100) {
                this.Hour_rate = hourRate;
            } else
                throw new IllegalArgumentException("Hour rate must be greater or equal 15 and less than or equal 100.");
    }
    public double getHour_rate(){
        return Hour_rate;
    }



    //2 return methods
    @Override
    public double earnPerMonth() {
        return (Hours_per_week*Hour_rate)*4;
    }

    public int vacationDays(){
        return 15;
    }


}
