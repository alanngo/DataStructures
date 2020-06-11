package sandbox;

import static java.lang.System.out;

public class Base
{
    // base constructor
    public Base()
    {
        out.println("Inside base constructor");
    }

    // base print overridden in derived by replacement
    public void print()
    {
        out.println("Base.print()");
    }

    // base print overridden in derived by refinement
    public void print1(){out.println("Refinement overriding called from Base");}

    //base method
    public void baseMethod()
    {
        out.println("Base.baseMethod()");
    }

}

