package tip25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class _Main {
    public static void main(String[] args) {
        Object[] objects1 = new Long[1];//数组是协变的 Sub是Supper的子类，那么Sub[] 也是Supper[] 子类
        objects1[0]="333";
        //不合法
//       List<Object> objectList = new ArrayList<Long>(); //泛型不是协变类型，所以编译不通过
        System.out.println();


        //证明创建泛型数组是非法的
//        List<String>[] stringListArr = new List<String>[1];//generic array creation error
//        List<Integer> intList = Arrays.asList(4);
//        Object[] objects = stringListArr; //因为数组是协变类型，使对象数组变为字符串列表数组
//        objects[0] = intList;//将字符串列表数组第一个元素赋值为整数列表
//        String s = stringListArr[0].get(0);//从整数列表取出第一个元素转化为string,这是就会产生classCastException

    }
}
