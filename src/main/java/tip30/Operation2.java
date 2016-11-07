package tip30;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public enum Operation2 {
    PLUS{
        @Override
        double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS {
        @Override
        double apply(double x, double y) {
            return x-y;
        }
    },
    DIVIDES {
        @Override
        double apply(double x, double y) {
            return x/y;
        }
    },
    TIMES {
        @Override
        double apply(double x, double y) {
            return x*y;
        }
    };
    abstract double apply(double x ,double y);

    public static void main(String[] args) {
        System.out.println(Operation2.DIVIDES.apply(1,34));
    }
}
