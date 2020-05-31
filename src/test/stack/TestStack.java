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
        Stack<String> stack = new ArrayStack<>();
        out.println(stack);
        assertTrue(stack.empty());
    }

    @Test
    public void test1() // push, peek
    {
        Stack<String> stack = new ArrayStack<>();
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
        Stack<String> stack = new ArrayStack<>();
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
        Stack<String> stack = new ArrayStack<>();
        stack.push("Austin");
        stack.push("Dallas");
        stack.push("Fort Worth");
        stack.push("Houston");
        stack.push("San Antonio");
        out.println(stack);
        assertTrue(stack.contains("Austin"));
    }

    @Test
    public void test4() // push, size
    {
        Stack<String> stack = new ArrayStack<>();
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
        Stack<String> stack = new ArrayStack<>();
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
