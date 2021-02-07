import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStoreTest {

    MusicStore shop;

    @Before
    public void setUp(){
        shop = new MusicStore();
    }

    @Test
    public void hasEmptyStockList(){
        assertEquals(0, shop.getStock().size());
    }


}
