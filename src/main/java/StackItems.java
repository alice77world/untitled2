import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackItems extends Item{ //стопка
    Stack<Item> items1 = new Stack<Item>();
    int limitQuantity = 15;

    StackItems(String name, double weight, String color,int limitQuantity) {
        super(name, weight, color, true);
        this.limitQuantity = limitQuantity;
    }
    void addItem(Item item1){
        if((item1.isFlat()==true)&&(this.allQuantity()<limitQuantity)) {
            this.items1.push(item1);
        }
    }
    void getInfo() {
        System.out.println("Name: "+this.getName());
        System.out.println("Weight: "+this.getWeight());
        System.out.println("Color: "+this.getColor());
        System.out.println("Limit quantity: "+this.limitQuantity);
        System.out.println("Content: "+this.showContentItems());
    }
    void pullOutItem(){
        this.items1.pop();
    }
    int allQuantity(){
        int allquantity = this.items1.size();
        return allquantity;
    }
    void searchIem(Item item1){
        boolean result = this.items1.contains(item1);
        if (result==true){
            System.out.println("Элемент "+ this.getName()+"содержит "+item1.getName());
        }
    }
    String showContentItems(){
        String result = " ";
        Iterator<Item> listIter = items1.iterator();
        while(listIter.hasNext()){
            result= result + listIter.next().getName()+" ";
        }
        return result;
    }
}
