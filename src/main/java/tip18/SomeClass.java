package tip18;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/7 0007.
 */
public class SomeClass {
    static List<Integer> intArrayAsList(final int[] a){
        if(a==null){
            throw new NullPointerException();
        }
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }


}
