package tip5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Administrator on 2016/6/1 0001.
 */
public class Person1 {
    private final Date birthDate;

    private static final Date START_DATE;
    private static final Date END_DATE;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        START_DATE = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        END_DATE = gmtCal.getTime();
    }


    public Person1(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(START_DATE)>=0&&birthDate.compareTo(END_DATE)<0;
    }
}
