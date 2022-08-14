import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 12; i++) {
            myArrayList.add("java");
        }

        System.out.println(myArrayList.get(10));

        myArrayList.set("Element10", 10);

        System.out.println(myArrayList.get(10));

        myArrayList.add("Element13");
        myArrayList.add("Element14");
        System.out.println(myArrayList.get(13));
        myArrayList.remove(13);
        System.out.println(myArrayList.get(13));

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("Element0");
        myLinkedList.add("Element1");
        myLinkedList.add("Element2");
        myLinkedList.add("Element3");
        myLinkedList.add("Element4");
        myLinkedList.add("Element5");
        myLinkedList.add("Element6");
        myLinkedList.add("Element7");
        myLinkedList.add("Element8");
        myLinkedList.add("Element9");

        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(8));
        myLinkedList.set(3, "Hello");
        System.out.println(myLinkedList.get(3));
        myLinkedList.remove(3);
        System.out.println(myLinkedList.get(3));

    }
}
