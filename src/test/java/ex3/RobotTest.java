package ex3;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RobotTest {

    @Test
    public void testOpenBox() throws Exception {
        Robot robot = new Robot();
        assertThat(robot.openBox("PlainBox"), is("そのまま開けます"));
        assertThat(robot.openBox("RibbonedBox"), is("リボンをほどいて、箱を開けます"));
        assertThat(robot.openBox("LockedBox"), is("開錠して、箱を開けます"));
    }
}