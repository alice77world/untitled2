public class Item { //предмет
    private String name;
    private double weight;
    private String color;
    private boolean flat; //плоскость

    Item(String name, double weight, String color,boolean flat){
        this.setName(name);
        this.setWeight(weight);
        this.setColor(color);
        this.setFlat(flat);
    }
    public void getInfo(Item item1){
        System.out.println("name: "+item1.name);
        System.out.println("weight: "+item1.weight);
        System.out.println("color: "+item1.color);
        System.out.println("flat: "+item1.flat);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getColor() { return color; }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFlat() {
        return flat;
    }
    public void setFlat(boolean flat) {
        this.flat = flat;
    }
    @Override
    public String toString() {
        return  getName();
    }
}
