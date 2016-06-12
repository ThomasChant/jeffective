package tip25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class Reduction {
    static <E> E  reduce(List<E> list ,Function<E> f,E initVal){
//        synchronized (list){
//            Object result = initVal;
//            for(Object o : list){
//                result = f.apply(result,o);
//            }
//            return result;
//        }
        List<E> snapshot ;
        synchronized (list){
           snapshot = new ArrayList<E>(list);
        }

        E result = initVal;
        for(E e :snapshot){
            result = f.apply(result,e);
        }
        return result;
    }


}

interface Function<T>{
   T apply(T arg1,T arg2);
}
