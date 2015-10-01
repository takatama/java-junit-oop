package ex2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    @Test
    public void testGetArea() throws Exception {
        Rectangle rect = new Rectangle(5, 10);
        assertThat(rect.getArea(), is(50.0));
    }
}