package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        this.elements = (E[])new Object[0];
    }

    public boolean isEmpty() {
        return elements.length==0;
    }

    public void push(E foobar) {
        Object[] copyOfArray = Arrays.copyOf(elements,elements.length+1);
//        E[] addNewElement = Arrays.copyOf(elements,elements.length+1);
        copyOfArray[copyOfArray.length-1] = foobar;
        elements=copyOfArray;
    }

    public E pop() {
        Object lastElement = elements[elements.length-1];
        elements = Arrays.copyOf(elements,elements.length-1);
        return (E)lastElement;
    }
}
