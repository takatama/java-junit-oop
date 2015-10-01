package ex1;

import ex1.MyMath;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyMathTest {

    @org.junit.Test
    public void testSum() throws Exception {
        MyMath math = new MyMath();
        assertThat(math.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), is(55));
    }
}