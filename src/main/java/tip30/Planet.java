package tip30;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public enum Planet {
    MERCURY(3.302e+23,2.439e6),
    VENUS(4.869e+24,6.052e6),
    EARTH(5.975e+24,6.378e6),
    MARS(6.419e+23,3.393e6),
    JUPITER(1.899e+27,7.149e7),
    SATURN(5.685e+26,6.027e7),
    URANUS(8.683e+25,2.556e7),
    NEPTUNE(1.024e+26,2.477e7);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;
    private final static double G = 6.67300E-11;
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G*mass/radius*radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    private double surfaceWeight(double mass){
        return mass * surfaceGravity;
    }

    public static void main(String[] args) {
        //根据某物体在地球上的重力，求它在其他星球上的重力
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入地球上该物体重量");
        double weightOnEarth = scan.nextDouble();
        double mass = weightOnEarth/Planet.EARTH.getSurfaceGravity();
        for(Planet planet : Planet.values()){
            System.out.printf("%s surface weight is %f%n",planet,planet.surfaceWeight(mass));
        }
    }
}
