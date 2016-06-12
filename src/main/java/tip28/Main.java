package tip28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class Main {
    public static void main(String[] args) {
//        List<? extends Number> num = new ArrayList<Double>();
//        Double d = (Double)num.get(0);
//        List<? super Number> obj = new ArrayList<Object>();
//        obj.add((Number)new Object());
        List<String> stringList = Arrays.asList("3232","3dsdfs","xzx","d");
        swap(stringList,3,2);
        System.out.println(stringList);
    }

    public void test1(){

    }

//    public static <E> void swap(List<E> list,int i ,int j){
//
//    }

    public static void swap(List<?> list ,int i ,int j){
        swapHelper(list,i,j);
    }

    private static <E> void swapHelper(List<E> list,int i ,int j){
        list.set(i,list.set(j,list.get(i)));
    }
}
