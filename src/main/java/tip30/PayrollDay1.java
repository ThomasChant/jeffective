package tip30;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public enum  PayrollDay1 {
    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKEND);

    private final PayType payType;
    PayrollDay1(PayType payType) {
        this.payType = payType;
    }

    public double apply(double x, double y){
        return payType.apply(x,y);
    }

    //采用策略枚举,将行为相同的枚举常量整合到一起
    private enum PayType{
        WEEKDAY{
            @Override
            double apply(double hourWorked, double payRate) {
                double basePay = hourWorked * payRate;
                double  overtimePay = (hourWorked<=HOUR_PER_SHIFT)?0:(hourWorked-HOUR_PER_SHIFT)*payRate/2;
                return basePay + overtimePay;
            }
        },
        WEEKEND{
            @Override
            double apply(double hourWorked, double payRate) {
                double basePay = hourWorked * payRate;
                double overtimePay = hourWorked*payRate/2;
                return basePay + overtimePay;
            }
        };
        private static final int HOUR_PER_SHIFT = 8;
        abstract double apply(double hourworked,double payRate);
    }

    public static void main(String[] args) {
        //计算每天工作相同时长的薪水
        double workHours = 9;
        double payrate = 10;
        for(PayrollDay1 pay:PayrollDay1.values()){
            System.out.printf("work %f hours on %s the salary is %f%n",workHours,pay,pay.apply(9,10));
        }
    }

}
