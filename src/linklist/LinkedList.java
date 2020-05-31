package linklist;

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
    public int getSize(){return size;}

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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        // start from head
        Node<E> tmp = head;

        //iterate thru nodes
        while (tmp != null)
        {
            sb.append(tmp.getData().toString()).append("\n");
            tmp = tmp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
