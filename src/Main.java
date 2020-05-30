import linklist.*;

import static java.lang.System.*;

public class Main
{
    static void testLinkedList()
    {
        out.println("testing linked list");
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Houston");
        list.append("Dallas");
        list.prepend("Fort Worth");
        list.prepend("San Antonio");

        out.println(list);
    }


    public static void main(String [] args)
    {
        testLinkedList();
    }

}
