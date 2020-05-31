package main.stack;

public interface Stack <E>
{
     /**
     * inserts element to stack
      * @param elem: element to be inserted
      * */
     void push(E elem);

     /**
      * removes top element from stack
      * */
     void pop();

     /**
      * clears stack
      * */
     void clear();

     /**
      * checks stack for certain element
      * @param elem: element to be searched for
      * @return true if element exists in stack
      * */
     boolean contains(E elem);

     /**
      * checks stack if empty
      * @return true if size == 0
      * */
     boolean empty();

     /**
      * gets current size of stack
      * @return current size
      * */
     int size();

     /**
      * gets the top of the stack
      * @return element on top of stack
      * */
     Object peek();
}
