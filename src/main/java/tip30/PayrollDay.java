package tip30;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public enum PayrollDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    private static final int HOUR_PER_SHIFT = 8;
    public double apply(double hourWorked,double payRate){
        double basePay = hourWorked * payRate;
        double overtimePay ;
        switch (this){
            case THURSDAY: case SUNDAY:
                overtimePay = hourWorked*payRate/2;
            default:
                overtimePay = (hourWorked<=HOUR_PER_SHIFT)?0:(hourWorked-HOUR_PER_SHIFT)*payRate/2;
                break;
        }
        return overtimePay + basePay;
    }
}
