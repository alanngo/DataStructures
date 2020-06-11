package sandbox;

import static java.lang.System.out;

public class Derived extends Base
{
    // implicitly calls Base() constructor
    public Derived() { out.println("Inside derived constructor"); }

    //replacement overriding
    @Override
    public void print()
    {
        out.println("Derived.print()");
    }

    @Override
    public void print1()
    {
        super.print1();
        out.println("Called from derived");
    }

    // exclusive to derived class
    public void derivedMethod()
    {
        out.println("Derived.derivedMethod()");
    }
}