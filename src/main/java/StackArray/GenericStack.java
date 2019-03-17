package StackArray;

import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    E[] elements;


    public GenericStack() {
        this.elements = (E[]) new Object[0];
//        size =0;

//                (E[])Array.newInstance(elements.getClass(),10);
//        size = elements.length;
    }


    public boolean isEmpty() {
        return elements.length==0;


    }

    public void push(E foobar) {

        E[] addNewElement = Arrays.copyOf(elements,elements.length+1);
        addNewElement[addNewElement.length-1] = foobar;
        elements=addNewElement;
    }

    public E pop() {
        E lastElement = elements[elements.length-1];
        elements = Arrays.copyOf(elements,elements.length-1);
        return lastElement;
    }
}
