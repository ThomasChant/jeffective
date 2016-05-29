package tip21;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class Host {
    private static class StrLenCmp implements Comparator<String>,Serializable{

        @Override
        public int compare(String str1, String str2) {
            return str1.length() - str2.length();
        }
    }

    public static final Comparator<String> STR_LEN_CMP = new StrLenCmp();

    public static void main(String[] args) {
      int a =  STR_LEN_CMP.compare("aaa","d");
        String ret = a>0?"长":a==0?"相等":"短";
        System.out.println(ret);
    }
}
