import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Box extends Item { //коробка
    ArrayList<Item> items = new ArrayList<Item>();
    double limitWeight = 15;

    Box(String name, double weight, String color, double limitWeight) {
        super(name, weight, color,true);
        this.limitWeight = limitWeight;
    }

    void addItem(Item item1){
        if((item1.getWeight()+this.allWeight())<this.limitWeight) {
            this.items.add(item1);
        }
    }
    void pullOutItem(){
        int a = this.items.size();
        if(a>=1){
            int k = (int)(Math.random()*(a-1))+1;
            this.items.remove(k);
        }
    }
    boolean searchIem(Item item1){
        boolean result = this.items.contains(item1);
        return result;
    }
    void getInfo() {
        System.out.println("Name: "+this.getName());
        System.out.println("Weight: "+this.getWeight());
        System.out.println("Color: "+this.getColor());
        System.out.println("Limit weight: "+this.limitWeight);
        System.out.println("All weight: "+this.allWeight());
        System.out.println("Content: "+this.showContentItems());
    }
    double allWeight(){
        double allweight = 0;
        ListIterator<Item> listIter = items.listIterator();
        while(listIter.hasNext()){
            allweight= allweight + listIter.next().getWeight();
        }
        return allweight;
    }
    String showContentItems(){
        String result = " ";
        ListIterator<Item> listIter = items.listIterator();
        while(listIter.hasNext()){
            result= result + listIter.next().getName()+" ";
        }
        return result;
    }
}
