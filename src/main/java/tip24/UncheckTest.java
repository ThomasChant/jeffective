package tip24;

import java.util.*;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class UncheckTest {
    public static void main(String[] args) {

        Set<Object> strings = new HashSet<>();
        strings.addAll(Arrays.asList("33","44"));
        for(Object s : strings){
            System.out.println(s);
        }

    }

}
