public class Run {
    public static void main(String[] args) {
        Item brick1 = new Item("Кирпич",2.5,"Red",true);
        Bag bag2 = new Bag("Сумка",0.3,"Green",true,20);
        bag2.addItem(brick1);
        System.out.println(bag2.searchIem(brick1));
        bag2.pullOutItem();
        System.out.println(bag2.searchIem(brick1));
        Item brick2 = new Item("Кирпич2",3.5,"Red",true);
        Item brick3 = new Item("Кирпич3",5.5,"White",true);
        bag2.addItem(brick2);
        bag2.addItem(brick3);
        System.out.println(bag2.showContentItems());
        System.out.println(bag2.allWeight());
        bag2.getInfo();
        Box box4 = new Box("Коробка4",0.5,"Yellow",10);
        Item brick6 = new Item("Кирпич6",5.5,"White",true);
        Item block1 = new Item("Блок1",5,"White",true);
        box4.addItem(block1);
        box4.addItem(brick6);//кирпич6 не добавлен в коробку 4, т.к вес будет выше предельно допустимого
        box4.getInfo();
        StackItems stack1 = new StackItems("Стопка1",0.5,"Blue",5);
        Item book1 = new Item("Книга1",0.5,"Black", true);
        Item book2 = new Item("Книга2",0.5,"Black", true);
        Item ball1 = new Item("Шар1",5,"Black", false);
        Item book3 = new Item("Книга3",0.5,"Black", true);
        stack1.addItem(book1);
        stack1.addItem(book2);
        stack1.addItem(ball1);//шар в стопку не добавлен, т.к шар не плоский
        stack1.addItem(book3);
        stack1.getInfo();
        stack1.pullOutItem();//была удалена книга 3, т.к в стопке удаляется последний элемент
        stack1.getInfo();
    }
}
