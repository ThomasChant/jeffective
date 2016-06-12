package tip8;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Circle)){
            return false;
        }

       return Double.compare(radius,((Circle) o).radius)==0;
    }

    public static void main(String[] args) {
        Circle c = new Circle(Double.NaN);
        Circle c1 = new Circle(1.2);
        Shape s = new Circle(1.1);
        System.out.println(s.equals(c));
    }
}
