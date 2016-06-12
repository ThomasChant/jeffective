package tip8;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2016/6/4 0004.
 */
public class CounterPoint extends Point {

    private static final AtomicInteger couter = new AtomicInteger();
    public CounterPoint(int x, int y) {
        super(x, y);
        couter.incrementAndGet();
    }
    public int numCreated(){
        return couter.get();
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            CounterPoint c = new CounterPoint(1,2);
            System.out.println("numCreated:"+c.numCreated());
        }
        System.out.println();
    }
}
