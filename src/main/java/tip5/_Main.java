package tip5;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2016/6/1 0001.
 */
public class _Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Person person = new Person(sdf.parse("19491201"));
        Person1 person1 = new Person1(sdf.parse("19491201"));
        long start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
          person1.isBabyBoomer();
//            System.out.println(ret);
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"ms");
    }
}
