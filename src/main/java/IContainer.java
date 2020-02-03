/** Интерфейс IContainer содержит абстрактные методы:
 * добавить элемент
 * вытащить предмет
 * найти предмет по имени
 * вывести названия предметов, которые внутри предмета-контейнера
 */
public interface IContainer {
    void addItem(Item item) throws ItemStoreException,ItemAlreadyPlacedException,PutTheContainerInsideItselfException;
    void pullOutItem();
    boolean searchItem(String name);
    String showContentItems();
}
