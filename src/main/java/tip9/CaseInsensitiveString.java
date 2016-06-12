package tip9;

/**
 * Created by Administrator on 2016/6/4 0004.
 */
public class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }


    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(o.s,s);
    }
}
