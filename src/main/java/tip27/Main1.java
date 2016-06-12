package tip27;

import tip21.Comparator;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class Main1<E> {
    private static UnaryFunction<Object> IDENTIFY_FUNCTION = new UnaryFunction<Object>() {
        @Override
        public Object apply(Object arg) {
            return arg;
        }
    };

    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction(){
        return (UnaryFunction<T>)IDENTIFY_FUNCTION;
    }

    public static void main(String[] args) {
        String[] strings = {"juce","help","aa"};
        UnaryFunction<String> sameString = identityFunction();
        for(String s : strings){
            System.out.println(sameString.apply(s));
        }
        HashMap<String,Object> map = Main1.newHashMap();
        map.put("aa",new Date());
        Main1.newHashMap();
    }


    public static <K,V> HashMap<K,V> newHashMap(){
        return new HashMap<K,V>();
    }

    public  <T extends Comparable<? super T>> T max(List<? extends T> list){
        Iterator<? extends T> i = list.iterator();
        T ret = i.next() ;

        while (i.hasNext()){
            T t = i.next();
            if(ret.compareTo(t)<0){
                ret = t;
            }
            return t;
        }
        return ret;
    }
}
