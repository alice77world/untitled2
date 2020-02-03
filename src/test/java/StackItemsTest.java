import org.junit.Test;

import static org.junit.Assert.*;

public class StackItemsTest {

    @Test
    public void addItem() {
        Item book1 = new Item("Справочник1",0.3,"White",true);
        Item book2 = new Item("Справочник2",0.3,"Grey",true);
        StackItems stackItems = new StackItems("Стопка",0,"Default",3);
        try {
            stackItems.addItem(book1);
            stackItems.addItem(book2);
        } catch (ItemStoreException e) {
            e.printStackTrace();
        } catch (ItemAlreadyPlacedException e) {
            e.printStackTrace();
        } catch (PutTheContainerInsideItselfException e) {
            e.printStackTrace();
        }
        int actual = stackItems.allQuantity();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void getInfo() {
        Item book1 = new Item("Справочник1",0.3,"White",true);
        StackItems stackItems = new StackItems("Стопка",0,"Default",3);
        try {
            stackItems.addItem(book1);
        } catch (ItemStoreException e) {
            e.printStackTrace();
        } catch (ItemAlreadyPlacedException e) {
            e.printStackTrace();
        } catch (PutTheContainerInsideItselfException e) {
            e.printStackTrace();
        }
        String  actual = stackItems.getInfo();
        String expected = " name: Стопка; weight: 0.3; color: Default; Limit quantity: 3; Content:  Справочник1 ;";
        assertEquals(expected,actual);
    }

    @Test
    public void pullOutItem() {
        Item book1 = new Item("Справочник1",0.3,"White",true);
        Item book2 = new Item("Справочник2",0.3,"White",true);
        StackItems stackItems = new StackItems("Стопка",0,"Default",3);
        try {
            stackItems.addItem(book1);
            stackItems.addItem(book2);
        } catch (ItemStoreException e) {
            e.printStackTrace();
        } catch (ItemAlreadyPlacedException e) {
            e.printStackTrace();
        } catch (PutTheContainerInsideItselfException e) {
            e.printStackTrace();
        }
        stackItems.pullOutItem();
        boolean  actual = stackItems.searchItem("Справочник2");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void allQuantity() {
        Item book1 = new Item("Справочник1",0.3,"White",true);
        Item book2 = new Item("Справочник2",0.3,"White",true);
        StackItems stackItems = new StackItems("Стопка",0,"Default",3);
        try {
            stackItems.addItem(book1);
            stackItems.addItem(book2);
        } catch (ItemStoreException e) {
            e.printStackTrace();
        } catch (ItemAlreadyPlacedException e) {
            e.printStackTrace();
        } catch (PutTheContainerInsideItselfException e) {
            e.printStackTrace();
        }
        int actual = stackItems.allQuantity();
        int expected = 2;
        assertEquals(expected,actual);
    }

}