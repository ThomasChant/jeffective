package tip3;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class Elvis implements Serializable{
    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){}
    public static Elvis getInstance(){
        return INSTANCE;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("序列化前："+INSTANCE);
//        System.out.println(INSTANCE);
//        System.out.println(getInstance());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d://serializable"));
        objectOutputStream.writeObject(INSTANCE);
//        objectOutputStream.writeObject(new Date());
//        objectOutputStream.writeObject("aaaa");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d://serializable"));
        Elvis elvis = (Elvis)objectInputStream.readObject();
        System.out.println("反序列化："+elvis);
    }


    private Object readResolve(){
        return INSTANCE;
    }
}
