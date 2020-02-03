import java.util.*;
/** Класс Мешок - это предмет-контейнер, он тоже является предметом,
 * но фактически содержит несколько предметов внутри.
 * Класс Мешок наследуется от класса Предмет и от интерфейса IContainer
 * Предельный вес мешка - 15у.е.
 */
public class Bag extends Item implements IContainer {
    ArrayList<Item> items = new ArrayList<Item>();
    double limitWeight = 15;

    /** Конструктор создания мешка с параметрами:
     * @param name имя
     * @param weight вес
     * @param color цвет
     * @param flat плоскость
     */
    Bag(String name, double weight, String color, boolean flat) {
        super(name, weight, color, flat);
        this.limitWeight = limitWeight;
    }

    /** Метод добавления предмета в контейнер. Переопределяем метод интерфейса IContainer
     * Данный метод может выбрасывать исключения, если вес будет выше допустимого,
     * или предмет уже положен в другой контейнер, или при попытке положить контейнер в самого себя.
     * После того как предмет положили в контейнер, вес контейнера увеличивается (к весу контейнера добавляем вес предмета)
     * и устанавливаем значение переменной "лежит ли предмет в контейнере" на истину.
     */
    @Override
    public void addItem(Item item) throws ItemStoreException, ItemAlreadyPlacedException,PutTheContainerInsideItselfException {
        if ((item.getWeight()+this.getWeight())>=this.limitWeight) throw new ItemStoreException(item);
        else if (item.isDoesTheItemLieInContainer()) throw new ItemAlreadyPlacedException(item);
        else if(item.equals(this)) throw new PutTheContainerInsideItselfException(item);
            this.items.add(item);
            double weight = this.getWeight();
            this.setWeight(weight + item.getWeight());
            item.setDoesTheItemLieInContainer(true);
    }

    /** Метод вытащить предмет (достается случайный). Переопределяем метод интерфейса IContainer
     * Узнаем количество элементов в мешке и удаляем случайный предмет.
     */
    @Override
    public void pullOutItem() {
        int a = this.items.size();
        if (a >= 1) {
            int k = (int) (Math.random() * (a - 1));
            this.items.remove(k);
        }
    }
    /** Метод поиска предмета по имени в предмете-контейнере
     * Проходим циклом по всем предметам в коллекции предмета-контейнера,
     * и сравниваем имена предметов в коллекции с веденной строкой
     * Метод возвращает true при наличии такого предмета.
     * Переопределем метод интерфейса IContainer
    */
    @Override
    public boolean searchItem(String name) {
        boolean result = false;
        ListIterator<Item> listIter = items.listIterator();
        while(listIter.hasNext()) {
            if ((listIter.next().getName()) == name) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Данный метод возвращает строку с информацией о предмете
     */
    public String getInfo() {
        String result = "";
        result += "name: "+this.getName()+"; ";
        result += "weight: "+this.getWeight()+"; ";
        result += "color: "+this.getColor()+"; ";
        result += "flat: "+this.isFlat()+"; ";
        result += "Limit weight: "+this.limitWeight+"; ";
        result += "Content: "+this.showContentItems()+";";
        return result;
    }

    /** Переопределяем метод интерфейса IContainer
     * Данный метод возвращает строку с названиями предметов, хранящихся в мешке
     */
    @Override
    public String showContentItems() {
        String result = " ";
        ListIterator<Item> listIter = items.listIterator();
        while(listIter.hasNext()){
            result= result + listIter.next().getName()+" ";
        }
        return result;
    }
}


