package tip27;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class Main {
    public static <E> Set<E> union(Set<E> s1,Set<E> s2){
         Set<E> result = new HashSet<>(s1);
         result.addAll(s2);
         return result;
    }

}
