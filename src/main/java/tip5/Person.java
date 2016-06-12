package tip5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Administrator on 2016/6/1 0001.
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//        System.out.println("日历对象："+gmtCal);
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1966,Calendar.JANUARY,1,0,0,0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart)>=0 && birthDate.compareTo(boomEnd)<0;
    }


}
