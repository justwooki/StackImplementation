package stack;

import java.util.EmptyStackException;

public interface IStack<E> {
    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items;
     * false otherwise.
     */
    boolean isEmpty();

    /**
     * Looks at the object at the top of this stack without removing
     * it from the stack.
     *
     * @return the object at the top of this stack
     * (the last item of the Vector object).
     * @throws EmptyStackException - if this stack is empty
     */
    E peek();

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @return the object at the top of this stack
     * (the last item of the Vector object)
     * @throws EmptyStackException - if this stack is empty
     */
    E pop();

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack
     * @return the item argument
     */
    E push(E item);

    /**
     * Returns the 1-based position where an object is on this stack.
     * If the object o occurs as an item in this stack, this method returns
     * the distance from the top of the stack of the occurrence nearest the
     * top of the stack; the topmost item on the stack is considered to be
     * at distance 1. The equals method is used to compare o to the items
     * in this stack.
     *
     * @param o the desired object
     * @return the 1-based position from the top of the stack where the
     * object is located; the return value -1 indicates that the object
     * is not on the stack
     */
    int search(Object o);
}
