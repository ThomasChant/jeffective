package tip8;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y,Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint)o).color==color;
    }

    private enum Color{
        RED,
        BLUE
    }

    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint(1,2,Color.BLUE);
        Point colorPoint1 = new ColorPoint(1,2,Color.RED);
//        System.out.println(colorPoint.equals(colorPoint1));
//        System.out.println(colorPoint instanceof Point);

        ColorPoint colorPoint2 = new ColorPoint(1,2,Color.BLUE);
        Point point = new Point(1,2);
        System.out.println(colorPoint2.equals(point));
        System.out.println(point.equals(colorPoint2));

    }
}
