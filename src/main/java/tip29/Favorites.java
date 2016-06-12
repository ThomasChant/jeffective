package tip29;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class Favorites {
    private Map<Class<?>,Object> favorites = new HashMap<>();
    public <T> void putFavorites(Class<T> type,T instance){
        if(type == null)
            throw new NullPointerException();
        favorites.put(type,instance);
    }
    public <T> T getFavorite(Class<T> type){
       return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();
        favorites.putFavorites(String.class,"java");
        favorites.putFavorites(Integer.class,Integer.MAX_VALUE);
        favorites.putFavorites(Class.class,Favorites.class);
        System.out.println(favorites.getFavorite(String.class));
        System.out.println(favorites.getFavorite(Integer.class));
        System.out.println(favorites.getFavorite(Class.class));
    }

}
