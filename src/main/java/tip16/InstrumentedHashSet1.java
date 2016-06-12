package tip16;

import tip8.Point;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/5 0005.
 */
public class InstrumentedHashSet1<E> extends ForwardingSet<E>{

    private int addCount = 0;

    public InstrumentedHashSet1(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }

    public static void main(String[] args) {
//        InstrumentedHashSet1<Point> points = new InstrumentedHashSet1<>(new HashSet<>());
//        points.addAll(Arrays.asList(new Point(1, 1), new Point(1, 2), new Point(3, 4)));
//        System.out.println(points.getAddCount());
    }
}

