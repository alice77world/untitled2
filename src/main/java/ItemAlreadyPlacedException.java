import io.qameta.allure.Step;

public class ItemAlreadyPlacedException extends Exception {
    public ItemAlreadyPlacedException(Item item) {
        super("Item  " + item.getName() + " placed in another container ");
    }
}

