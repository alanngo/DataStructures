package test.search;

import main.search.*;
import org.junit.*;

import static org.junit.Assert.*;

public class TestSearch
{
    String[] arr = {"Austin", "Dallas", "El Paso", "Fort Worth", "Houston"};
    String[] arr0 = {"C", "Java", "Javascript", "Python"};
    @Test
    public void test0() //linear search
    {
        Search<String> s = new Search<>(arr);
        assertEquals(s.linearSearch("El Paso"), 2);
    }

    @Test
    public void test1() //binary search w/ odd num of elements
    {
        Search<String> s = new Search<>(arr);

        assertEquals(s.binarySearch("Fort Worth"), 3);
        assertEquals(s.binarySearch("Dallas"), 1);
        assertEquals(s.binarySearch("Austin"), 0);
        assertEquals(s.binarySearch("El Paso"), 2);
        assertEquals(s.binarySearch("Houston"), 4);
    }

    @Test
    public void test2() //binary search w/ odd num of elements
    {
        Search<String> s = new Search<>(arr0);

        assertEquals(s.binarySearch("Java"), 1);
        assertEquals(s.binarySearch("C"), 0);
        assertEquals(s.binarySearch("Python"), 3);
        assertEquals(s.binarySearch("Javascript"), 2);
    }

}
