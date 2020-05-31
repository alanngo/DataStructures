package main.linklist;

class Node <E>
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
        StringBuilder sb = new StringBuilder();
        try
        {
            sb.append(this.data.toString()).append("->");
        }
        catch (NullPointerException e)
        {
            sb.append("->X");
        }
        return sb.toString();
    }
}
