package main.stack;

import java.util.*;

public class LinkedStack <E> extends Stack<E>
{
    Node<E> head;
    Node<E> tail;

    public LinkedStack()
    {
        super();
        head = tail = null;
    }

    /**
     * inserts element to stack
     *
     * @param elem : element to be inserted
     */
    @Override
    public void push(E elem)
    {
        Node<E> tmp = new Node<>(elem);

        if (empty())
            head = tail = tmp;
        else
        {
            // add element at end
            tail.setNext(tmp);

            //make the tail the tmp node
            tail = tmp;
        }
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


        Node<E> tmp = head;

        while (tmp!=null)
        {
            if(tmp.getNext().getData().equals(peek()))
            {
                tmp .setNext(null);
                tail = tmp;
                break;
            }
            tmp = tmp.getNext();
        }
        size --;
    }

    /**
     * clears stack
     */
    @Override
    public void clear()
    {
        head = tail = null;
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
        Node<E> tmp = head;

        while (tmp!=null)
        {
            if (tmp.getData().equals(elem))
                return true;

            tmp = tmp.getNext();
        }
        return false;
    }

    /**
     * checks stack if empty
     *
     * @return true if size == 0 or head == null
     */
    @Override
    public boolean empty() {return this.head==null || super.empty();}

    /**
     * gets current size of stack
     *
     * @return current size
     */
    @Override
    public int size() { return super.size();}

    /**
     * gets the top of the stack
     *
     * @return element on top of stack
     */
    @Override
    public E peek() { return tail.getData(); }

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
        return super.toString();
    }
}
