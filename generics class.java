import java.util.ArrayList;
import java.util.Collections;

public class SimpleGenerics<T extends Comparable<T>> {
    ArrayList<T> list;

    SimpleGenerics(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> sortValues() {
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(1);
        intList.add(2);

        SimpleGenerics<Integer> intGenerics = new SimpleGenerics<>(intList);
        System.out.println("Sorted int values: " + intGenerics.sortValues());

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("c");
        stringList.add("a");
        stringList.add("b");

        SimpleGenerics<String> stringGenerics = new SimpleGenerics<>(stringList);
        System.out.println("Sorted string values: " + stringGenerics.sortValues());
    }
}
