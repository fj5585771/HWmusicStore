import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsForSaleTest {

    @Test
    public void itemHasBeenBought(){
        ItemsForSale drumkit = new ItemsForSale(2000, 4000);
        assertEquals(2000, drumkit.getCost(), 0.0);
        assertEquals(4000, drumkit.getSellingPrice(), 0.0);
    }

    @Test
    public void calculateMarkUpForItemSold(){

    }

    @Test
    public void calculateMarkUpForAllItemsSold(){

    }

}
