package tip8;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/4 0004.
 */
public class UnitCircle {
    private static final Set<Point> unitCircle;
    static {
        unitCircle = new HashSet<>();
        unitCircle.add(new Point(1,0));
        unitCircle.add(new Point(0,-1));
        unitCircle.add(new Point(0,1));
        unitCircle.add(new Point(-1,0));
    }

    public static boolean onUnitCircle(Point p){
        return unitCircle.contains(p);
    }
    public static void main(String[] args) {
//        System.out.println(UnitCircle.onUnitCircle(new Point(1,0)));
    }
}
