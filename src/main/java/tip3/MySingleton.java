package tip3;

import tip21.Host;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public enum MySingleton {
    MY_SINGLETON(new Host());
    MySingleton(Host a){
        System.out.println("实例化"+a);
    }

    public int getNum(){
        return 0;
    }
    public static void main(String[] args) {
        MySingleton.MY_SINGLETON.getNum();
        MySingleton.MY_SINGLETON.getNum();
        MySingleton.MY_SINGLETON.getNum();
    }
}
