import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PluckTest {

    Pluck pluck;

    @Before
    public void setUp(){
        pluck = new Pluck(2.00, 5.00, "Pearly and made from Graphite");
    }

    @Test
    public void pluckExists(){
        assertNotNull(pluck);
    }

    @Test
    public void hasDescription(){
        assertEquals("Pearly and made from Graphite", pluck.getDescription());
    }

}
