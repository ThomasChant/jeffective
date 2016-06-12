package tip9;

import java.util.HashMap;
import java.util.Map;
//import java.util.Objects;

/**
 * Created by Administrator on 2016/6/3 0003.
 */
public class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(short areaCode, short prefix, short lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }


    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof PhoneNumber)){
            return false;
        }
        PhoneNumber p = (PhoneNumber)o;
        return p.areaCode==areaCode && p.lineNumber==lineNumber && p.prefix==prefix;
    }


    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + areaCode;
        result = 31*result + prefix;
        result = 31*result + lineNumber;
        return result;
    }


    public static void main(String[] args) {
//        Map<PhoneNumber,String> info = new HashMap<>();
//        PhoneNumber phoneNumber = new PhoneNumber((short)12,(short)2,(short)33);
//        PhoneNumber phoneNumber1 = new PhoneNumber((short)12,(short)2,(short)33);
//        System.out.println(phoneNumber.hashCode());
//        System.out.println(phoneNumber1.hashCode());
//        System.out.println(phoneNumber.equals(phoneNumber1));
//        info.put(phoneNumber, "liming");
//        System.out.println(info.get(phoneNumber1));

    }
}

