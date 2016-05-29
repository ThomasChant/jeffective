package tip21;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class _Main {

    public static void main(String[] args) {
        int a = new Comparator<String>(){

            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        }.compare("hell222o","world");
        String ret = a>0?"长":a==0?"相等":"短";
        System.out.println(ret);
    }
}
