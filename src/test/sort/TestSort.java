package test.sort;

import main.sort.*;
import org.junit.*;

import static java.lang.System.*;
import static org.junit.Assert.*;

public class TestSort
{
    String [] gaming = {"msi", "razer", "asus", "corsair", "gigabyte", "alienware"};

    @Test
    public void test0() //bubble sort
    {
        Sort<String> s = new Sort<>(gaming);
        s.bubbleSort();
        out.println(s.toString());
        assertEquals(gaming[1], "asus");
    }

}
