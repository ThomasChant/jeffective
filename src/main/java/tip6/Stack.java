package tip6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by Administrator on 2016/6/1 0001.
 */
public class Stack {
    private int size = 0;
    private Object[] elements;
    private static final int DEFAULT_STACK_CAPICITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_STACK_CAPICITY];
    }

    public void push(Object o){
        elements[size++] = o;
        ensureCapitity();

    }

    public Object pop(){
        if(size==0)
            throw new EmptyStackException();
        return elements[--size];
    }


    private void ensureCapitity(){
        if(size==elements.length){
            elements = Arrays.copyOf(elements,2*size+1);
        }
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
