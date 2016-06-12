package tip15;

/**
 * Created by Administrator on 2016/6/5 0005.
 */
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double re,double im){
        this.re = re;
        this.im = im;
    }

    public double realPart(){return re;}
    public double imaginaryPart(){return im;}

    public Complex add(Complex cp){
        return new Complex(re+cp.re,im + cp.im);
    }

    public Complex substract(Complex cp){
        return new Complex(re-cp.re,im - cp.im);
    }

    public Complex multiply(Complex cp){
        return new Complex(re*cp.re-im*cp.im,re*cp.im+im*cp.re);
    }

    public Complex divide(Complex cp){
        double tmp = cp.re * cp.re + cp.im * cp.im;
        return new Complex((re*cp.re+im*cp.im)/tmp,
                (im * cp.re - re * cp.im)/tmp);
    }


    @Override
    public boolean equals(Object o){
        if(!(o instanceof Complex)){
            return false;
        }
        Complex c = (Complex)o;
        return Double.compare(c.re,re)==0 && Double.compare(c.im,im)==0;
    }


    @Override
    public int hashCode(){
        int  result = 17;
        result = result*31 + doubleHash(re);
        result = result*31 + doubleHash(im);
        return result;
    }

    private int doubleHash(double d){
        long l = Double.doubleToLongBits(d);
        return  (int)(l^(l>>>32));
    }

    @Override
    public String toString() {
        return "Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }


}
