public class MyLinkedList<E> {

    private int size = 0;
    private Node<E> firstElement;
    private Node<E> lastElement;

    public MyLinkedList() {
    }

    public void add(E element){
        Node<E> nodeLast = lastElement;
        Node<E> newNode = new Node<>(nodeLast, element, null);
        lastElement = newNode;
        if (nodeLast == null){
            firstElement = newNode;
        } else {
            nodeLast.next = newNode;
        }
        size++;
    }

    public E get(int index){
        checkIndex(index);
        return findNode(index).content;
    }

    public void set(int index, E element){
        checkIndex(index);
        findNode(index).content = element;
    }

    public void remove(int index){
        checkIndex(index);
        Node<E> result = findNode(index);
        Node<E> next = result.next;
        Node<E> previous = result.previous;
        if (next == null){
            firstElement = next;
        } else {
            previous.next = next;
            result.previous = null;
        }

        if (previous == null){
            lastElement = previous;
        } else {
            next.previous = previous;
            result.next = null;
        }
        result.content = null;
        size--;
    }

    private Node<E> findNode(int index){
        Node<E> result;
        if (index < size/2){
            result = firstElement;
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        } else {
            result = lastElement;
            for (int i = size - 1; i > index; i--) {
                result = result.previous;
            }
        }
        return result;
    }

    private void checkIndex(int index){
        if (index > size - 1){
            throw new IndexOutOfBoundsException("Index: " + index + " >= size: " + size);
        }
    }

    public int getSize() {
        return size;
    }

    class Node<E> {

        Node<E> next;
        Node<E> previous;
        E content;

        public Node(Node<E> previous, E content, Node<E> next) {
            this.next = next;
            this.previous = previous;
            this.content = content;
        }
    }

}
