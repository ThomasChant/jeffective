package tip6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2016/6/1 0001.
 */
public class _Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Random random = new Random(10);
//        System.out.println(stack.size());
        for(int i=0 ; i<17;i++){
            stack.push(random.nextInt(100));
        }
        System.out.println(stack);
        System.out.println(stack.size());
        for(int i=0 ;i<17;i++){
            Object o = stack.pop();
            System.out.print((Integer) o + ",");
        }


    }
}
