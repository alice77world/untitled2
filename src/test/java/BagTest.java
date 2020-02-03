import org.junit.Test;

import static org.junit.Assert.*;

public class BagTest {

    @Test
    public void addItem() {
        Item book = new Item("Справочник",0.3,"Белый",true);
        Bag bag = new Bag("Сменка",0.5,"Brown",false);
        try {
            bag.addItem(book);
        } catch (ItemStoreException e) {
            e.printStackTrace();
        }
        catch (PutTheContainerInsideItselfException e) {
            e.printStackTrace();
        }

        catch (ItemAlreadyPlacedException e) {
            e.printStackTrace();
        }

        boolean actual = bag.searchItem("Справочник");
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void pullOutItem() {
        Item book = new Item("Справочник",0.3,"Белый",true);
        Bag bag = new Bag("Сменка",0.5,"Brown",false);
        try {
            bag.addItem(book);
        } catch (ItemStoreException e) {
            e.printStackTrace();
        }
        catch (PutTheContainerInsideItselfException e) {
            e.printStackTrace();
        }

        catch (ItemAlreadyPlacedException e) {
            e.printStackTrace();
        }
        bag.pullOutItem();
        boolean actual = bag.searchItem("Справочник");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void showContentItems() {
        Item book1 = new Item("Справочник1",0.3,"Белый",true);
        Item book2 = new Item("Справочник2",0.3,"Белый",true);
        Bag bag = new Bag("Сменка",0.5,"Brown",false);
        try {
            bag.addItem(book1);
            bag.addItem(book2);
        } catch (ItemStoreException e) {
            e.printStackTrace();
        }
        catch (PutTheContainerInsideItselfException e) {
            e.printStackTrace();
        }

        catch (ItemAlreadyPlacedException e) {
            e.printStackTrace();
        }

        String actual = bag.showContentItems();
        String expected = " Справочник1 Справочник2 ";
        assertEquals(expected,actual);
    }
}