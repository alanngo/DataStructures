package test.linklist;

import org.junit.Test;

import main.linklist.*;

import static org.junit.Assert.*;
import static java.lang.System.*;

public class TestLinkedList
{
    @Test
    public void test0() // empty
    {
        LinkedList<String> list = new LinkedList<>();
        out.println(list);
        assertTrue(list.empty());
    }

    @Test
    public void test1() // prepend, contains
    {
        LinkedList<String> list = new LinkedList<>();
        list.prepend("Austin");
        list.prepend("Dallas");
        list.prepend("Houston");
        out.println(list);
        assertTrue(list.contains("Austin"));
    }

    @Test
    public void test2() // append, contains
    {
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Houston");
        list.append("Dallas");
        out.println(list);
        assertTrue(list.contains("Austin"));
    }

    @Test
    public void test3() // append, prepend, remove, contains
    {
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Dallas");
        list.prepend("Houston");
        list.remove("Dallas");
        out.println(list);
        assertFalse(list.contains("Dallas"));
    }
    @Test
    public void test4() // append, clear, empty
    {
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Houston");
        list.append("Dallas");
        list.clear();
        out.println(list);
        assertTrue(list.empty());
    }

    @Test
    public void test5() // prepend, size
    {
        LinkedList<String> list = new LinkedList<>();
        list.prepend("Austin");
        list.prepend("Dallas");
        list.prepend("Houston");
        list.prepend("San Antonio");
        list.prepend("Fort Worth");
        list.prepend("El Paso");
        out.println(list);
        assertEquals(list.size(), 6);
    }

    @Test
    public void test6() // append, indexOf
    {
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Dallas");
        list.append("Houston");
        list.append("San Antonio");
        list.append("Fort Worth");
        list.append("El Paso");
        out.println(list);
        assertEquals(list.indexOf("San Antonio"), 3);
    }

    @Test
    public void test7() //append, get
    {
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Dallas");
        list.append("Houston");
        list.append("San Antonio");
        list.append("Fort Worth");
        list.append("El Paso");
        out.println(list);
        assertEquals(list.get(3), "San Antonio");
    }

    @Test
    public void test8() //append, rotate
    {
        LinkedList<String> list = new LinkedList<>();
        list.append("Austin");
        list.append("Dallas");
        list.append("Houston");
        list.append("San Antonio");
        list.append("Fort Worth");
        list.append("El Paso");
        list.rotate(3);
        assertEquals(list.get(0), "San Antonio");

        out.println(list);
    }
}
