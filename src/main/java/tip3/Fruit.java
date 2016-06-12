package tip3;



import java.io.*;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public enum Fruit {
    APPLE("red",11);
    private String color;
    private double price;

    Fruit(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("未序列化："+Fruit.APPLE.toString());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d://fruit"));
        objectOutputStream.writeObject(Fruit.APPLE);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d://fruit"));
        Fruit fruit = (Fruit)objectInputStream.readObject();
        System.out.println("反序列化："+fruit);
        System.out.println("同一个对象："+(Fruit.APPLE == fruit));
    }



}
