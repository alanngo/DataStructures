package linklist;

public class Node <E>
{
    private E data;
    private Node<E> next;

    Node(E data) {setData(data);}

    void setNext(Node<E> next) {this.next = next;}
    Node<E> getNext() {return next;}

    void setData(E data) {this.data = data;}
    E getData(){ return data;}

    @Override
    public String toString()
    {
        try
        {
            return this.data.toString() + "->" + next.data.toString();
        }
        catch (NullPointerException e)
        {
            return this.data.toString() + "->X";
        }
    }
}
