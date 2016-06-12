package tip3;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public enum Apple {
    INSTANCE;

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println(Apple.INSTANCE.getClass());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d://apple"));
        objectOutputStream.writeObject(INSTANCE);


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d://apple"));
        Apple apple = (Apple)objectInputStream.readObject();
        System.out.println(apple);
    }
}
