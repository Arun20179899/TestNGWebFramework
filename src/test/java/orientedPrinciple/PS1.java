package orientedPrinciple;

import org.testng.annotations.Test;

public class PS1 {
    int a = 3;
    @Test
    public void getValue(){
        PS2 ps2 = new PS2(a);
        System.out.println(ps2.increment()); // without passing value to the method
        // we will access and print the values with the help of constructor
        System.out.println(ps2.decrement());
        // now, without creating object of PS3
        // we need to access the mutiplyTwo and multiplyThree methods
//        PS3 ps3 = new PS3(a); --> this also possible
//        but senior peers are not allowed to create
//        multiple instance creation in a single method
        // we use existing object instance to access the those two methods

        System.out.println(ps2.multiplyTwo());
        System.out.println(ps2.multiplyThree());

    }
}
