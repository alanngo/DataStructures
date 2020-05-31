import linklist.*;

import static java.lang.System.*;

public class Main
{
    static void test(boolean condition)
    {
        if (condition)
            out.println("test passed");
        else
            err.println("TEST FAILED");
    }

    static void test(int current, int actual)
    {
        if (current == actual)
            out.println("test passed");
        else
            err.println("got "+ current+" expected "+ actual);
    }


    static void testLinkedList()
    {
        out.println("testing linked list");
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Houston");
        list.append("Dallas");
        list.prepend("Fort Worth");
        list.prepend("San Antonio");
        list.remove("Austin");
        list.remove("Houston");
        test(!list.contains("Austin"));
        test(!list.contains("El Paso"));
        test(list.getSize(), 3);
        out.println(list);

        list.clear();
        test(list.getSize(), 0);
    }


    public static void main(String [] args)
    {
        testLinkedList();
    }

}
