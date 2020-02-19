import io.qameta.allure.Step;

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
    @Step
    public String getInfo(){
        String result = "";
        result += "name: "+this.name+"; ";
        result += "weight: "+this.weight+"; ";
        result += "color: "+this.color+"; ";
        result += "flat: "+this.flat+"; ";
        return result;
    }
    @Step
    public String getName() { return name; }
    @Step
    public void setName(String name) { this.name = name; }
    @Step
    public double getWeight() { return weight; }
    @Step
    public void setWeight(double weight) { this.weight = weight; }
    @Step
    public String getColor() { return color; }
    @Step
    public void setColor(String color) { this.color = color; }
    @Step
    public boolean isFlat() { return flat; }
    @Step
    public void setFlat(boolean flat) { this.flat = flat; }
    @Step
    public boolean isDoesTheItemLieInContainer() { return doesTheItemLieInContainer; }
    @Step
    public void setDoesTheItemLieInContainer(boolean doesTheItemLieInContainer) { this.doesTheItemLieInContainer = doesTheItemLieInContainer; }

    /**
     * переопределяем метод toString()
     * @return данный метод возвращает имя предмета
     */
    @Override
    @Step
    public String toString() {
        return  getName();
    }
}
