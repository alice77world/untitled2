import io.qameta.allure.Step;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/** Стопка - предмет-контейнер наследуется от Предмета и интерфейса IContainer,
 * содержит поле предельное количество
 */
public class StackItems extends Item implements IContainer{ //стопка
    Stack<Item> items = new Stack<Item>();
    int limitQuantity;

    /**Конструктор создания объекта стопка
     * с указанием предельного количества элементов в стопке
     */
    StackItems(String name, double weight, String color,int limitQuantity) {
        super("Стопка", weight, color, true);
        this.limitQuantity = limitQuantity;
    }

    /**Добавление предмета в стопку всегда наверх
     *при превышении количества допустимых предметов, получаем исключение
     */
    @Step
    @Override
    public void addItem(Item item) throws ItemStoreException,ItemAlreadyPlacedException,PutTheContainerInsideItselfException {
        if (this.items.size()>=limitQuantity) throw new ItemStoreException(item);
        if (item.isDoesTheItemLieInContainer()) throw new ItemAlreadyPlacedException(item);
            if(item.isFlat()) {this.items.push(item);}
            item.setDoesTheItemLieInContainer(true);
            this.setWeight(this.getWeight()+item.getWeight());

    }

    /**Метод возвращает строку с информацией о стопке
     */
    @Step
    public String getInfo() {
        String result = " ";
        result += "name: "+this.getName()+"; ";
        result += "weight: "+this.getWeight()+"; ";
        result += "color: "+this.getColor()+"; ";
        result += "Limit quantity: "+this.limitQuantity+"; ";
        result += "Content: "+this.showContentItems()+";";
        return result;
    }

    /**Когда забираем предмет из стопки, то забираем всегда сверху.
     */
    @Override
    @Step
    public void pullOutItem() {
        this.items.pop();
    }

    /**Метод возвращает количество предметов внутри предмета-контейнера
     */
    @Step
    public int allQuantity(){
           return this.items.size();
    }

    /** Метод для поиска предмета внутри стопку по имени
     * возвращает логический тип данных (true,false)
     */
    @Override
    @Step
    public boolean searchItem(String name){
        boolean result = false;
        Iterator<Item> listIter = items.listIterator();
        while(listIter.hasNext()) {
            if ((listIter.next().getName()) == name) {
                result = true;
            }
        }
        return result;
    }

    /**метод возвращает строку с названиями предметов внутри предмета-контейнера
     */
    @Override
    @Step
    public String showContentItems(){
        String result = " ";
        Iterator<Item> iter = items.iterator();
        while(iter.hasNext()){
            result= result + iter.next().getName()+" ";
        }
        return result;
    }
}
