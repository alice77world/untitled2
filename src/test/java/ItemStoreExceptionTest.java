import org.junit.Test;

import static org.junit.Assert.*;

public class ItemStoreExceptionTest {//выдает исключение т.к превышен предельныйй вес
    @Test(expected = ItemStoreException.class)
    public void testAdditionLimitWeightException() throws ItemStoreException, ItemAlreadyPlacedException, PutTheContainerInsideItselfException {
        Bag schoolBag = new Bag("Школьный рюкзак",0.5,"Red",false);
        Item block = new Item("Строительный блок",20,"Brown",true);
        schoolBag.addItem(block);
    }
    @Test(expected = ItemStoreException.class)//выдает исключение т.к превышено предельное количество
    public void testAdditionLimitQuantityException() throws ItemStoreException, ItemAlreadyPlacedException, PutTheContainerInsideItselfException {
        StackItems stack = new StackItems("Стопка",0,"Default",2);
        Item block = new Item("Строительный блок",2,"Brown",true);
        Item block1 = new Item("Строительный блок1",2,"Brown",true);
        Item block2 = new Item("Строительный блок2",2,"Brown",true);
        stack.addItem(block);
        stack.addItem(block1);
        stack.addItem(block2);
    }
}