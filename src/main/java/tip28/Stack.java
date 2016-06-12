package tip28;

import tip2.NutritionFacts;

import java.util.*;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class Stack<E> {
    private int size = 0;
    private Object[] elements;
    private static final int DEFAULT_STACK_CAPICITY = 16;

    @SuppressWarnings("unchecked")
    public Stack(){
        elements = (E[])new Object[DEFAULT_STACK_CAPICITY];
    }

    public void push(E o){
        elements[size++] = o;
        ensureCapitity();

    }

    public E pop(){
        if(size==0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked") E e = (E)elements[--size];
        return e;
    }


    private void ensureCapitity(){
        if(size==elements.length){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }


    public void pushAll(Iterable<? extends E> src){
        for(E e: src){
            push(e);
        }
    }

    public void popAll(Collection<E> c){
        while (!isEmpty()){
            c.add(pop());
        }
    }


    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        List<Integer> integers = Arrays.asList(1,2,34,5);
        numberStack.pushAll(integers);

//        numberStack.popAll(new ArrayList<Object>());
    }
}
