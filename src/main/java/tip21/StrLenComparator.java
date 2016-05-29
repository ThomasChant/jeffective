package tip21;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class StrLenComparator implements Comparator<String> {
    private StrLenComparator(){}
    public static final StrLenComparator INSTANCE = new StrLenComparator();
    @Override
    public int compare(String str1, String str2) {
        return str1.length()-str2.length();
    }
}
