/**
 * Item - основной класс (предмет)
 * имеет поля:
 * название - строковый тип
 * веc - вещественный тип
 * цвет - строковый тип
 * плоскость - логический тип
 * помещен ли в контейнер - логический тип
 */
public class Item { //предмет
    private String name;
    private double weight;
    private String color;
    private boolean flat; //плоскость
    private boolean doesTheItemLieInContainer;

    /**
     * Конструктор созания предемета с параметрами:
     * @param name
     * @param weight
     * @param color
     * @param flat
     */
    Item(String name, double weight, String color,boolean flat){
        this.setName(name);
        this.setWeight(weight);
        this.setColor(color);
        this.setFlat(flat);
        this.setDoesTheItemLieInContainer(false);
    }

    /**
     * метод getInfo() возвращает информацию о предмете в виде строки
     */
    public String getInfo(){
        String result = "";
        result += "name: "+this.name+"; ";
        result += "weight: "+this.weight+"; ";
        result += "color: "+this.color+"; ";
        result += "flat: "+this.flat+"; ";
        return result;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFlat() { return flat; }
    public void setFlat(boolean flat) { this.flat = flat; }
    public boolean isDoesTheItemLieInContainer() { return doesTheItemLieInContainer; }
    public void setDoesTheItemLieInContainer(boolean doesTheItemLieInContainer) { this.doesTheItemLieInContainer = doesTheItemLieInContainer; }

    /**
     * переопределяем метод toString()
     * @return данный метод возвращает имя предмета
     */
    @Override
    public String toString() {
        return  getName();
    }
}
