import Bag.Backpack;
import Bag.Bag;

public class Main {
    public static void main(String[] args) {
        Bag backpack = new Backpack();

        System.out.println(backpack.isEmpty());

        backpack.add(1);
        backpack.add(2);
        backpack.add(5);
        backpack.add(0);
        backpack.add(9);
        backpack.add(9);

        System.out.println(backpack.getCurrentSize());
        System.out.println(backpack.isEmpty());
        System.out.println(backpack.getFrequencyOf(9));
        System.out.println(backpack.contains(9));
        System.out.println(backpack.remove());
        System.out.println(backpack.remove(9));
        System.out.println(backpack.toArray()[1]);
        System.out.println(backpack.getCurrentSize());

    }
}
