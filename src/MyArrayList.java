import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList<E> {

    private Object[] elements;
    private static final int DEFAULT_ELEMENT_CAPACITY = 10;
    private int size;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_ELEMENT_CAPACITY];
        this.size = 0;
    }

    public void add(E element){
        if (size == elements.length){
            growCapacity();
        }
        elements[size] = element;
        size++;
    }

    public E get(int index){
        if (index < size) {
            return (E) elements[index];
        } else throw new IndexOutOfBoundsException("Index: " + index + " >= size: " + size);
    }

    public void set(E element, int index){
        if (index < size){
            elements[index] = element;
        } else throw new IndexOutOfBoundsException("Index: " + index + " >= size: " + size);

    }

    public void remove(int index){
        if (index < size){
            for (int i = index; i < elements.length-1; i++) {
                elements[i] = elements[i+1];
            }
            elements[elements.length-1] = null;
        } else throw new IndexOutOfBoundsException("Index: " + index + " >= size: " + size);
    }

    public int getSize(){
        return size;
    }

    private void growCapacity(){
        Object[] temp = Arrays.copyOf(elements, elements.length + 10);
        elements = temp;
    }


}
