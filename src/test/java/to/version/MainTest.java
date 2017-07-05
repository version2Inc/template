package to.version;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MainTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testFail() {
        exception.expect(AssertionError.class);
        fail();
    }

}