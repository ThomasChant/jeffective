package tip34;

/**
 * Created by Administrator on 2016/4/10 0010.
 */
public enum BasicOperation implements Operation {
    PLUS("+"){
        public double apply(double x ,double y){return  x+y;}
    },
    MINUS("-"){
        public double apply(double x,double y){return x-y;}
    },
    DIVICE("/"){
        public double apply(double x,double y){return x/y;}
    },
    TIMES("*"){
        public double apply(double x, double y) {
            return x*y;
        }
    }
    ;

    private final String symbol;
    BasicOperation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
