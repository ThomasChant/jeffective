package tip30;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public enum  Operation3 {
    PLUS("+"){
        @Override
        double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS("-"){
        @Override
        double apply(double x, double y) {
            return x-y;
        }
    },
    DIVIDES("/"){
        @Override
        double apply(double x, double y) {
            return x/y;
        }
    },
    TIMES("*"){
        @Override
        double apply(double x, double y) {
            return x*y;
        }
    };

    private final String symbol ;
    Operation3(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return symbol;
    }
    abstract double apply(double x ,double y);

    private static Map<String,Operation3> stringToEnum = new HashMap<String,Operation3>();

    static {
        for(Operation3 op : Operation3.values()){
            stringToEnum.put(op.toString(),op);
        }
    }

    public static Operation3 fromString(String symbol){
        return stringToEnum.get(symbol);
    }


    public static void main(String[] args) {
        double x = 9;
        double y = 20;
        for(Operation3 op : Operation3.values()){
            System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x,y));
        }

        System.out.println(Operation3.DIVIDES.fromString("/"));
    }
}
