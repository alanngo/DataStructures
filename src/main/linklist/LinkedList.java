package main.linklist;

public class LinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList()
    {
        head = tail = null;
        size = 0;
    }


    public boolean empty() { return this.head == null;}
    public boolean contains(E data)
    {
        //start from head
        Node<E> tmp = head;
        while(tmp!=null)
        {
            if (tmp.getData().equals(data))
                return true;

            tmp = tmp.getNext();
        }
        return false;
    }
    public int size(){return size;}
    public int indexOf(E data)
    {
        Node<E> node = head;
        int cnt = 0;
        while (node!=null)
        {
            if (node.getData().equals(data))
                return cnt;
            node = node.getNext();
            cnt++;
        }
        return -1;
    }

    public E get(int index)
    {
        if (index >=size)
            throw new IndexOutOfBoundsException("element at "+index+" does not exist!");
        Node<E> tmp = head;
        int i = 0;
        while (tmp!=null)
        {
            if (i == index)
                return tmp.getData();

            tmp = tmp.getNext();
            i++;
        }
        return null;
    }


    public void clear()
    {
        head = tail = null;
        size = 0;
    }
    public void prepend(E data)
    {
        // create new node
        Node<E> node = new Node<>(data);

        //check if empty
        if (empty())
            this.head = this.tail = node;

        else
        {
            // make next of new node head
           node.setNext(head);

           // move head to point to new node
           this.head = node;
        }
        size++;
    }

    public void append(E data)
    {
        // create new node
        Node<E> node = new Node<>(data);

        //check if empty
        if (empty())
            this.head = this.tail = node;

        else
        {
            // add element at end
            this.tail.setNext(node);

            //make new node the tail
            this.tail = node;
        }
        size++;
    }

    public void remove(E data)
    {
        if (!contains(data))
            throw new IllegalArgumentException("No such element named "+data.toString());

        // start from head
        Node<E> tmp = head;

        //create prev node
        Node<E> prev = null;

        //keep track of previous node
        while (tmp != null)
        {
            if (tmp.getData().equals(data))
            {
                prev = tmp;
                prev= prev.getNext();
                break;
            }
            tmp = tmp.getNext();
        }

        Node<E>curr = head;

        // set current node to previous node
        while(curr != null)
        {
            // join prev node and curr node together
            if (curr.getNext().getData().equals(data))
            {
                curr.setNext(prev);
                break;
            }
            curr = curr.getNext();
        }
        size--;
    }

    public void rotate(int n)
    {
        // keep track of position
        int cnt = 1;

        // current node
        Node<E> curr = head;

        // loop thru the list to find nth node
        while(curr!= null && cnt < n)
        {
            curr = curr.getNext();
            cnt++;
        }

        // if curr is null, n is greater or equal to size of list
        // do nothing at this point
        if (curr == null)
            return;

        // pivot node found,
        Node<E> nthNode = curr;

        // get the remaining elements
        while(curr.getNext() != null)
            curr = curr.getNext();

        curr.setNext(head);

        head = nthNode.getNext();

        nthNode.setNext(null);
    }


    @Override
    public String toString()
    {
        if (empty())
            return "<empty list>";
        StringBuilder sb = new StringBuilder();
        // start from head
        Node<E> tmp = head;

        //iterate thru nodes
        while (tmp != null)
        {
            sb.append(tmp.toString());
            tmp = tmp.getNext();
        }
        return sb.toString();
    }
}
