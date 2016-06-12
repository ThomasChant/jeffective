package tip8;

/**
 * Created by Administrator on 2016/6/4 0004.
 */
public class ColorPoint1 {
    private final Point point;
    private final Color color;

    private enum Color{
        RED,
        BLUE
    }

    public ColorPoint1(Point point, Color color) {
        this.point = point;
        this.color = color;
    }

    public Point asPoint(){
        return point;
    }

    public boolean equals(Object o){
        if(!(o instanceof ColorPoint1)){
            return false;
        }
        ColorPoint1 cp = (ColorPoint1)o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    public static void main(String[] args) {
        Point point = new Point(1,2);
        ColorPoint1 cp = new ColorPoint1(point,Color.BLUE);
        ColorPoint1 cp1 = new ColorPoint1(point,Color.BLUE);
        ColorPoint1 cp2 = new ColorPoint1(point,Color.BLUE);
        System.out.println(cp.equals(cp));
        System.out.println(cp.equals(cp1));
        System.out.println(cp.equals(cp2));


    }
}
