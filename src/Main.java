import static java.lang.System.*;
import sandbox.*;

public class Main
{
    static int cnt = 0;
    static
    {
        cnt++;
    }

    public static void main(String[] args)
    {
//        out.println("\ncreate a Base object ");
//        Base x = new Base();
//        x.baseMethod(); //call to Base.baseMethod()
//        x.print(); // call Derived.print()
//        //((Derived)x).derivedMethod(); causes ClassCastException
//
//        out.println("\ncreate a Derived object ");
//        Derived y = new Derived();
//        y.baseMethod(); //call to Base.baseMethod()
//        y.print(); // call Derived.print()
//        y.derivedMethod(); //can call derived methods
//
//        out.println("\ncreate a Base object by calling Derived Constructor");
//        Base z = new Derived();
//        y.baseMethod(); //call to Base.baseMethod()
//        z.print(); //call Derived.print()
//        ((Derived) z).derivedMethod(); //need to cast to call derived methods


        out.println("\nRefinement and replacement overriding");
        Base b = new Derived();

        // replacement overriding
        b.print();

        //refinement overriding
        b.print1();
    }



}
