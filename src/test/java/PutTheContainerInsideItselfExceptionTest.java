import org.junit.Test;

import static org.junit.Assert.*;

public class PutTheContainerInsideItselfExceptionTest {
    @Test(expected = PutTheContainerInsideItselfException.class)
    public void testPutTheContainerInsideItselfException() throws ItemStoreException, ItemAlreadyPlacedException, PutTheContainerInsideItselfException {
        Bag schoolBag = new Bag("Школьный рюкзак",0.5,"Red",false);
        schoolBag.addItem(schoolBag);
    }
}