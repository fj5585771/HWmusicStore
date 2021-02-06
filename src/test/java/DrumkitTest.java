import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DrumkitTest {

    Drumkit drumkit;


    @Before
    public void setUp() throws Exception {
        drumkit = new Drumkit(1000, 1800, "black", "percussion", 6, 2);
    }

    @Test
    public void hasDrumkit(){
        assertNotNull(this.drumkit);
    }

    @Test
    public void canPlay() {
        assertEquals("SMACK, BANG, CRASH!!", drumkit.play());
    }

    @Test
    public void hasColour(){
        assertEquals("black", drumkit.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("percussion", drumkit.getType());
    }

    @Test
    public void hasDrums(){
        assertEquals(6, drumkit.getDrums());
    }

    @Test
    public void hasPedals(){
        assertEquals(2, drumkit.getPedals());
    }

}
