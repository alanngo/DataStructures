package linklist;

public class LinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;

    public LinkedList() {}

    public Node<E> getHead() {return head;}
    public Node<E> getTail() {return tail;}

    public void prepend(E data)
    {
        // create new node
        Node<E> node = new Node<>(data);

        //check if empty
        if (this.head == null)
            this.head = this.tail = node;

        else
        {
            // make next of new node head
           node.setNext(head);

           // move head to point to new node
           head = node;
        }
    }

    public void append(E data)
    {
        // create new node
        Node<E> node = new Node<>(data);

        //check if empty
        if (this.head == null)
            this.head = this.tail = node;
        else
        {
            // add element at end
            this.tail.setNext(node);

            //make new node the tail
            this.tail = node;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        // start from head

        Node<E> tmp = head;
        while (tmp != null)
        {
            sb.append(tmp.getData().toString()).append("\n");
            tmp = tmp.getNext();
        }
        return sb.toString();
    }
}
