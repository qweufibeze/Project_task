package Task_06;

//Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
//Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
//Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.

import java.util.Arrays;
import java.util.Comparator;

public class Backpack {

    static final int maxWeightOfBackpack = 20;
    static int currentWeightOfBackPack;
    static double currentValueOfBackPack ;
    static int indexItem ;

    public static void main(String[] args) {
        Item item1 = new Item(9, 45);
        Item item2 = new Item(14, 65);
        Item item3 = new Item(6, 34);
        Item item4 = new Item(14, 100);
        Item item5 = new Item(4, 50);

        final Item[] items = {item1, item2, item3, item4, item5};
        Arrays.sort(items, Comparator.comparingDouble(Item::getSpecificValue).reversed());

        while(currentWeightOfBackPack < maxWeightOfBackpack && (items[indexItem].getWeight() + currentWeightOfBackPack) < maxWeightOfBackpack ) {
                currentValueOfBackPack += items[indexItem].getValue();
                currentWeightOfBackPack += items[indexItem].getWeight();
                indexItem++;
        }

        System.out.println("Общая ценность вмместившегося груза - " + currentValueOfBackPack);
        System.out.println("Общий вес вместившегося груза - " + currentWeightOfBackPack);
    }
}


class Item{

    private int weight;
    private int value;

    public Item(int weight, int value){
        this.weight = weight;
        this.value = value;
    }

    public double getSpecificValue(){
        return (double)value / (double)weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
