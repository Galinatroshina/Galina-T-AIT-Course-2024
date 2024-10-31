package classwork_36.ilist.model;

import java.util.Arrays;
import java.util.Iterator;

public class IListImpl implements  IList{

    Object[] elements;
    private int size;

    public IListImpl(int initialCapacity) {
        if(initialCapacity < 0){
            throw new IllegalArgumentException("Illegal capacity " + initialCapacity); //отрицательное не верно и он это покажет
        }

        this.elements = new Object[initialCapacity];
    }

    public IListImpl(){
        this(10); //начальный массив на 10 элементов
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(Object element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if(size == elements.length){ //ошибка размер по длине массива и максимум достигнут
            if(size == Integer.MAX_VALUE){
                throw new OutOfMemoryError("No memory");
            }
            int newCapacity = elements.length + elements.length / 2; //увеличили размер по элементам на 1,5 раза путем добавления снова и деления на два
            if(newCapacity < 0 ){
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity); //копирует массив в это же имя и увеличвает агруемент newCapa длину, что мы ее изменили
        }
    }

    @Override
    public boolean add(int index, Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndex(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
