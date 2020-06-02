package test.stack;

import main.stack.*;
import org.junit.Test;

import static java.lang.System.*;
import static org.junit.Assert.*;

public class TestStack
{
    @Test
    public void test0() // empty
    {
        ArrayStack<String> stack = new ArrayStack<>();
        out.println(stack);
        assertTrue(stack.empty());
    }

    @Test
    public void test1() // push, peek
    {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");

        out.println(stack);
        assertEquals(stack.peek(), "San Antonio");
    }

    @Test
    public void test2() // push, pop, peek
    {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");
        stack.pop();

        out.println(stack);
        assertEquals(stack.peek(), "Houston");
    }
    @Test
    public void test3() // push, contains
    {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");
        out.println(stack);
        assertTrue(stack.contains("Dallas"));
    }

    @Test
    public void test4() // push, size
    {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");

        out.println(stack);
        assertEquals(stack.size(), 5);
    }

    @Test
    public void test5() // push, clear, empty
    {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");
        stack.clear();

        out.println(stack);
        assertTrue(stack.empty());
    }

    @Test
    public void test6() // empty
    {
        LinkedStack<String> stack = new LinkedStack<>();
        out.println(stack);
        assertTrue(stack.empty());
    }

    @Test
    public void test7() // push, peek
    {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");

        out.println(stack);
        assertEquals(stack.peek(), "San Antonio");
    }

    @Test
    public void test8() // push, pop, peek
    {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");
        stack.pop();
        stack.pop();

        out.println(stack);
        assertEquals(stack.peek(), "Fort Worth");
    }

    @Test
    public void test9() // push, contains
    {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");
        out.println(stack);
        assertTrue(stack.contains("Austin"));
    }

    @Test
    public void test10() // push, size
    {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");

        out.println(stack);
        assertEquals(stack.size(), 5);
    }

    @Test
    public void test11() // push, clear, empty
    {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");
        stack.clear();

        out.println(stack);
        assertTrue(stack.empty());
    }
}
