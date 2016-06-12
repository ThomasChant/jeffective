package tip4;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class UtilityClass {
    //Suppress default constructor for noninstantiablitity
    private UtilityClass(){
        throw new AssertionError();
    }

    public static void main(String[] args) {
        UtilityClass u = new UtilityClass();

    }
}
