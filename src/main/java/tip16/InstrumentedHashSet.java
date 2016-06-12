package tip16;

import tip8.Point;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Administrator on 2016/6/5 0005.
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
//        boolean modified = false;
//        for (E e : c) {
//            if (add(e)) {
//                modified = true;
//            }
//        }
        return super.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }


    public static void main(String[] args) {
//        InstrumentedHashSet<Point> points = new InstrumentedHashSet<>();
//        points.addAll(Arrays.asList(new Point(1,1),new Point(1,2),new Point(3,4)));
//        System.out.println(points.getAddCount());
    }
}
