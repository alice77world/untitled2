public class ItemAlreadyPlacedException extends Exception {
    public ItemAlreadyPlacedException(Item item) {
        super("Item  " + item.getName() + " placed in another container ");
    }
}

