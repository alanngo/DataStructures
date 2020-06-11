package test;


import org.junit.runner.*;
import org.junit.runners.*;
import test.linklist.TestLinkedList;
import test.search.TestSearch;
import test.sort.TestSort;
import test.stack.TestStack;

@RunWith(Suite.class)
@Suite.SuiteClasses
({
        TestLinkedList.class,
        TestSearch.class,
        TestSort.class,
        TestStack.class,
        TestLinkedList.class
})
public class TestAll {} // running all tests
