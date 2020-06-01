package main.stack;

abstract class Stack <E>
{
     protected int size;

     Stack() { size = 0;}

     /**
     * inserts element to stack
      * @param elem: element to be inserted
      * */
     protected abstract void push(E elem);

     /**
      * removes top element from stack
      * */
     protected abstract void pop();

     /**
      * clears stack by setting size = 0
      * */
     protected void clear(){ size = 0;}

     /**
      * checks stack for certain element
      * @param elem: element to be searched for
      * @return true if element exists in stack
      * */
     protected abstract boolean contains(E elem);

     /**
      * checks stack if empty
      * @return true if size == 0
      * */
     protected boolean empty() { return size ==0;}

     /**
      * gets current size of stack
      * @return current size
      * */
     protected int size() {return size; }

     /**
      * gets the top of the stack
      * @return element on top of stack
      * */
     protected abstract E peek();
}
