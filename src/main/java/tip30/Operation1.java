package tip30;

/**
 * �������ö�٣�
 * ���ַ�ʽ���벻�����ţ����Ҳ�����dryԭ����������˲���������Ӧ��swith��ҲҪ���ӣ�����ᵼ�³���
 * Created by Administrator on 2016/6/13 0013.
 */
public enum Operation1 {
    PLUS,
    MINUS,
    DIVIDES,
    TIMES;
    public double apply(double x,double y){
        switch (this){
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case DIVIDES:
                return x / y;
            case TIMES:
                return x * y;
            default:
                throw new AssertionError("unsupporting operation"+this);
        }
    }

    public static void main(String[] args) {

            System.out.println( Operation1.PLUS.apply(1,4));
            System.out.println(Operation1.MINUS.apply(1, 4));
            System.out.println(Operation1.DIVIDES.apply(1,4));
            System.out.println(Operation1.TIMES.apply(1,4));


    }
}
