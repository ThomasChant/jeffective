package tip9;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/6/4 0004.
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.000");
        System.out.println(b1.equals(b2));
        System.out.println(b1.intValue());
        Set<BigDecimal> bigDecimalSet = new HashSet<>();
        bigDecimalSet.add(b1);
        bigDecimalSet.add(b2);
        System.out.println(bigDecimalSet.size());


        //有序集合根据comparable接口排序
        Set<BigDecimal> bigDecimals1 = new TreeSet<>();
        bigDecimals1.add(b1);
        bigDecimals1.add(b2);
        System.out.println(bigDecimals1.size());

    }
}
