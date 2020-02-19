import org.junit.Test;
import io.qameta.allure.Step;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void getInfo() {
        Item book = new Item("Справочник",0.3,"Белый",true);
        String actual = book.getInfo();
        String expected = "name: Справочник; weight: 0.3; color: Белый; flat: true; ";
        assertEquals(expected,actual);
    }

}