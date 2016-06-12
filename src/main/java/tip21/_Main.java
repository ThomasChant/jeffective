package tip21;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class _Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        int a = new Comparator<String>(){

            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        }.compare("hell222o","world");
        String ret = a>0?"长":a==0?"长":"短";
//        System.out.println(Arrays.toString("长".getBytes()));
    }
}
