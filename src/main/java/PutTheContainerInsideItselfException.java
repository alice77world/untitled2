
public class PutTheContainerInsideItselfException  extends Exception {
    public PutTheContainerInsideItselfException(Item item) {
        super("You try to put the container inside itself " + item.getName());
    }
}


