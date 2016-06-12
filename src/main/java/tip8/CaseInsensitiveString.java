package tip8;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class CaseInsensitiveString {
    private final String s;


    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o){
        System.out.println("o 是 实力："+ (o instanceof CaseInsensitiveString));
//        if(o instanceof CaseInsensitiveString){
            return o instanceof CaseInsensitiveString && ((CaseInsensitiveString)o).s.equalsIgnoreCase(s);
//        }
//        if(o instanceof String){
//            return s.equalsIgnoreCase((String)o);
//        }
//        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("nihao");
        System.out.println(caseInsensitiveString.equals(new CaseInsensitiveString("NIHAO")));
        System.out.println(caseInsensitiveString.equals(new CaseInsensitiveString("niHao")));
    }
}
