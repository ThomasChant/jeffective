package tip8;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Point)){
            return false;
        }
        Point p = (Point)o;
        return p.x == x && p.y==y;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + x;
        result = 31*result + y;
        return result;
    }
}
