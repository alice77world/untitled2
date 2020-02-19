import org.junit.Test;
import io.qameta.allure.Step;
import static org.junit.Assert.*;

public class ItemAlreadyPlacedExceptionTest {
    @Test(expected = ItemAlreadyPlacedException.class)
    public void testAdditionAlreadyPlacedException() throws ItemStoreException, ItemAlreadyPlacedException, PutTheContainerInsideItselfException {
        Item book = new Item("Сказки",0.5,"Brown",true);
        Bag schoolBag = new Bag("Школьный рюкзак",0.5,"Red",false);
        schoolBag.addItem(book);
        Bag pocket = new Bag("Пакет",0.1,"Blue",true);
        pocket.addItem(book);
    }
}