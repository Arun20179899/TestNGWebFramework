package orientedPrinciple;

import org.testng.annotations.Test;

public class PS2 extends PS3 {
    int a;

    public PS2(int a) {
        super(a); // Parent class constructor is invoked
        this.a = a;
    }

    @Test
    public int increment() {
        a = a + 1;
        return a;
    }

    @Test
    public int decrement() {
        a = a - 1;
        return a;
    }
}
