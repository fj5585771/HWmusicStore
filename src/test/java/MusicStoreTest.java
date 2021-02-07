import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStoreTest {

    MusicStore shop;
    ItemsForSale drumkit;
    ItemsForSale pluck;
    ItemsForSale drumkit2;
    ItemsForSale pluck2;

    @Before
    public void setUp(){
        shop = new MusicStore();
        drumkit2 = new Drumkit(3000, 7500, "Blue", "Mahogony", 7, 2);
        pluck2 = new Pluck(10, 20, "Premium marble");
    }

    @Test
    public void hasEmptyStockList(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItemsToStock(){
//        given
//        we have an empty shop list
        assertEquals(0, shop.getStock().size());
//        AND
//        we have an item
        drumkit = new ItemsForSale(1000, 2000);
//        when
//        we add an item to our arraylist
        shop.addToStock(drumkit);
//        then
//        our list reflects this added item;
        assertEquals(1, shop.getStock().size());
        pluck = new ItemsForSale(2.00, 5.00);
        shop.addToStock(pluck);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveItemsFromStock(){
        assertEquals(0, shop.getStock().size());
        drumkit = new ItemsForSale(1000, 2000);
        shop.addToStock(drumkit);
        assertEquals(1, shop.getStock().size());
        shop.removeFromStock(drumkit);
        assertEquals(0, shop.getStock().size());
    }

//    public void calculateProfitForShopFromMarkUp(){
//        shop.addToStock(drumkit);
//        shop.addToStock(drumkit2);
//        shop.addToStock(pluck);
//        shop.addToStock(pluck2);
//        assertEquals(4, shop.getStock().size());
//        shop.calculateTotalMarkUpValue();
//        assertEquals(, shop.)
//
//    }


}
