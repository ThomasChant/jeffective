package tip23;

import java.util.*;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class GenericClassTest {
    public static boolean add(Collection<?> c ,Object o){
        for(Object e : c){
            System.out.println(e);
        }
        return true;
    }

    static int numEleInCommon(Set<?> s1,Set<?> s2){
        int result = 0;
        for(Object o1 : s1){
            if(s2.contains(o1)){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Collection<?> c = Arrays.asList(1, "23",new Date());
//        Collection<Object> co = Arrays.asList(1, "23",new Date());
//        System.out.println(c);
        for(Object o : c){
            System.out.println(o);
        }
//        for(Object o : co){
//            System.out.println(o);
//        }
//        System.out.println(List.class);
//        System.out.println(Arrays.class);
//        System.out.println(List[].class);
    }
}
