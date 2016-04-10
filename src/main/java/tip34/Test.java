package tip34;

import java.util.*;

/**
 * Created by Administrator on 2016/4/10 0010.
 */
public class Test {
    public static void main(String[] args) {
//        double x = Double.parseDouble(args[0]);
//        double y = Double.parseDouble(args[1]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入操作数1");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();
//        test(ExtendedOperation.class, x, y);
//        test(BasicOperation.class,x,y);
        List<Operation> a = new ArrayList<>();
        a.addAll(Arrays.asList(ExtendedOperation.values()));
        a.addAll(Arrays.asList(BasicOperation.values()));
        test(a, x, y);
    }
//    private static <T extends Enum<T> & Operation> void test(Class<T> opSet,double x,double y){
//        for(Operation op : opSet.getEnumConstants()){
//            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
//        }
//    }
    private static  void test(Collection<? extends Operation> opSet,double x,double y){
        for(Operation op : opSet){
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
