package main.stack;

import java.util.*;

import static java.util.Arrays.*;

public class ArrayStack<E> extends Stack<E>
{
    private static final int DEFAULT_SIZE = 10;
    Object [] elements;


    public ArrayStack(int s)
    {
        super();
        elements = new Object[s];
        fill(elements, null);
    }

    public ArrayStack() {this(DEFAULT_SIZE);}

    /**
     * inserts element to stack
     *
     * @param elem : element to be inserted
     */
    @Override
    public void push(E elem)
    {
        if (size == elements.length)
            return;
        elements[size] = elem;
        size++;
    }

    /**
     * removes top element from stack
     */
    @Override
    public void pop()
    {
        if (empty())
            throw new EmptyStackException();
        elements[size] = null;
        size --;
    }

    /**
     * clears stack
     */
    @Override
    public void clear()
    {
        fill(elements, null);
        super.clear();
    }

    /**
     * checks stack for certain element
     *
     * @param elem : element to be searched for
     * @return true if element exists in stack
     */
    @Override
    public boolean contains(E elem)
    {
        for (Object e: elements)
        {
            if (e.equals(elem))
                return true;
        }
        return false;
    }

    /**
     * checks stack if empty
     *
     * @return true if size == 0
     */
    @Override
    public boolean empty() {return super.empty();}

    /**
     * gets current size of stack
     *
     * @return current size
     */
    @Override
    public int size() {return super.size();}

    /**
     * gets the top of the stack
     *
     * @return element on top of stack
     */
    @Override
    @SuppressWarnings("unchecked")
    public E peek() { return(E) elements[size-1]; }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = size -1; i>=0; i--)
            sb.append("[").append(elements[i].toString()).append("]\n");
        return sb.toString();
    }


}
