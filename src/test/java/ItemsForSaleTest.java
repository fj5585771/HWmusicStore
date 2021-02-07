import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ItemsForSaleTest {

    @Test
    public void canCreateDrumkitToBeSold(){
        ItemsForSale drumkit = new ItemsForSale(2000, 4000);
        assertNotNull(drumkit);
    }

    @Test
    public void canCreateDrumkitToBeSoldDiffMethod(){
        Drumkit drumkit = new Drumkit(2000, 4000, "Black", "Percussion", 6, 3);
        ItemsForSale drumkitForSale = drumkit;
        assertNotNull(drumkitForSale);
    }

    // i suppose the test here isnt relevant to the function of the itemsforsale class and its appropraite testing methods.  The below WOULD be relevent if customer clss was introduced for interaction w/ shop.
    @Test
    public void itemHasBeenBought(){
        ItemsForSale drumkit = new ItemsForSale(2000, 4000);
        assertEquals(2000, drumkit.getCost(), 0.0);
        assertEquals(4000, drumkit.getSellingPrice(), 0.0);
    }

    @Test
    public void calculateMarkUpForDrumkitSold(){
        ItemsForSale drumkit = new ItemsForSale(2000, 4000);
        double itemMarkUp = drumkit.calculateMarkUp();
        assertEquals(100, itemMarkUp, 0.0);
    }

}
