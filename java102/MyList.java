package com.nested;

import java.util.Arrays;

public class MyList<T> {
    Object[] list;
    private int counter = 0;
    private int item = counter;

    public MyList() {
        this.list = new Object[10];
    }

    public MyList(int capacity) {
        this.list = new Object[capacity];
    }

    public int size() {
        return counter;
    }

    public int getCapacity() {
        return list.length;
    }

    public void add(T data) {
        if (list.length <= counter) {
            Object[] tList = new Object[2 * list.length];

            for (int i = 0; i <= list.length; i++) {
                tList[i] = list[i];
            }
            tList = list;
        }
        list[item] = data;
        counter++;
    }

    public T get(int index) {
        if (list[index] != null) {
            return (T) list[index];
        } else {
            return null;
        }
    }

    public void remove(int index) {
        if (list == null || index < 0 || index >= list.length) {
            return;
        }
        Object[] tList = new Object[getCapacity()];
        for (int i = 0; i < list.length; i++) {
            if (i == index) {
                continue;
            }
            if (index < i) {
                tList[i - 1] = list[i];
            } else {
                tList[i] = list[i];
            }
        }
        list = tList;
        counter--;
        item--;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= list.length) {
            return;
        } else {
            list[index] = data;
        }
    }

    public String toString() {
        String stringList = " ";
        for (int i = 0; i < size(); i++) {
            stringList += list[i];
        }
        return stringList;
    }

    public int indexOf(T data) {
        for (int i = 0; i <= size(); i++) {
            if (data.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = list.length - 1; i <= 0; i--) {
            if (list[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (list.length > 0) {
            return true;
        } else {
            return false;
        }
    }

    public T[] toArray(){
        return Arrays.copyOf((T[])list, counter);
    }

    public void clear(){
        for(int i=0; i<=size();i++){
            list[i]=null;
        }
        counter = 0;
    }

    public Object[] sublist(int start, int finish){
        int subLenght = finish - start;
        Object[] subList = new Object[subLenght];
        return Arrays.copyOfRange(subList, start, finish);
    }

    public boolean contains(T data){
        for(int i=0; i>=size(); i++) {
            if (list[i] == data) {
                return true;
            }
        }
        return false;
    }

}
