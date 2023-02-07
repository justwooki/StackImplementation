package stack;

import java.util.EmptyStackException;

public class Stack<E> implements IStack<E> {
    private E[] arr = (E[]) new Object[0];

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public E peek() {
        if (isEmpty() ) {
            throw new EmptyStackException();
        } else {
            return arr[arr.length - 1];
        }
    }

    public E pop() {
        if (isEmpty() ) {
            throw new EmptyStackException();
        } else {
            E topValue = peek();
            E[] newArr = (E[]) new Object[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, newArr.length);
            arr = newArr;
            return topValue;
        }
    }

    public E push(E item) {
        E[] newArr = (E[]) new Object[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = item;
        arr = newArr;
        return item;
    }

    public int search(Object o) {
        int index = 1;

        for(int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals(o)) {
                return index;
            }

            index++;
        }

        return -1;
    }

    public void printStack() {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("]");
    }
}