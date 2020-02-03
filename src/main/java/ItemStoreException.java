public class ItemStoreException extends Exception {
    public ItemStoreException(Item item) {
        super("Too much elements for " + item.getName());
    }
}





