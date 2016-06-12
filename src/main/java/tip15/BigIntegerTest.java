package tip15;

import java.math.BigInteger;

/**
 * Created by Administrator on 2016/6/5 0005.
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<1000000;i++){
            sb.append(1);
        }
        long start = System.currentTimeMillis();
        System.out.println();
        BigInteger bigInteger = new BigInteger(sb.toString());
        long end = System.currentTimeMillis();
        System.out.println(start-start1+"毫秒");
        System.out.println(end-start+"毫秒");
        System.out.println(bigInteger);
    }
}
