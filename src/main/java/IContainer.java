import io.qameta.allure.Step;

/** Интерфейс IContainer содержит абстрактные методы:
 * добавить элемент
 * вытащить предмет
 * найти предмет по имени
 * вывести названия предметов, которые внутри предмета-контейнера
 */
public interface IContainer {
    @Step
    void addItem(Item item) throws ItemStoreException,ItemAlreadyPlacedException,PutTheContainerInsideItselfException;
    @Step
    void pullOutItem();
    @Step
    boolean searchItem(String name);
    @Step
    String showContentItems();
}
