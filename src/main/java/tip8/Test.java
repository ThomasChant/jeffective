package tip8;



/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class Test {
    private int a;

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Test)){
            return false;
        }
        return a==((Test) o).a;
    }

    public static void main(String[] args) {
        System.out.println(new Test().equals(null));
    }
}
