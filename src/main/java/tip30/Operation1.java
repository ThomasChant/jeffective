package tip30;

/**
 * 运算操作枚举，
 * 这种方式代码不够优雅，而且不符合dry原则，如果增加了操作符，相应的swith里也要增加，否则会导致出错
 * Created by Administrator on 2016/6/13 0013.
 */
public enum Operation1 {
    PLUS,
    MINUS,
    DIVIDES,
    TIMES;
    public double apply(double x,double y){
        switch (this){
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case DIVIDES:
                return x / y;
            case TIMES:
                return x * y;
            default:
                throw new AssertionError("unsupporting operation"+this);
        }
    }

    public static void main(String[] args) {

            System.out.println( Operation1.PLUS.apply(1,4));
            System.out.println(Operation1.MINUS.apply(1, 4));
            System.out.println(Operation1.DIVIDES.apply(1,4));
            System.out.println(Operation1.TIMES.apply(1,4));


    }
}
