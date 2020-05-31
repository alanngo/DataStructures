package main.stack;

import static java.util.Arrays.*;

public class ArrayStack<E> implements Stack<E>
{
    private static final int DEFAULT_SIZE = 10;
    Object [] elements;
    int size;

    public ArrayStack(int s)
    {
        elements = new Object[s];
        fill(elements, null);
        size = 0;
    }

    public ArrayStack() {this(DEFAULT_SIZE);}

    @Override
    public void push(E elem)
    {
        if (size == elements.length)
            return;
        elements[size] = elem;
        size++;
    }

    @Override
    public void pop()
    {
        elements[size] = null;
        size --;
    }

    @Override
    public void clear()
    {
        fill(elements, null);
        size = 0;
    }

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

    @Override
    public boolean empty() { return size == 0; }

    @Override
    public int size() { return size; }

    @Override
    public Object peek() { return elements[size-1]; }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = size -1; i>=0; i--)
            sb.append("[").append(elements[i].toString()).append("]\n");
        return sb.toString();
    }
}
