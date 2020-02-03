import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/** Класс коробка - как мешок, только плоская (можно складывать в стопки)
 * Класс коробка наследуется от класса Мешок
 */
public class Box extends Bag { //коробка
    ArrayList<Item> items = new ArrayList<Item>();
    double limitWeight = 15;

    /**Конструктор создания предемета-контейнера Коробка
     * с полями: название, вес, цвет;
     */
    Box(String name, double weight, String color) {
        super(name, weight, color,true);
        this.limitWeight = limitWeight;
    }

}
