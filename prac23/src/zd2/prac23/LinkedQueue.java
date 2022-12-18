package zd2.prac23;

public class LinkedQueue<T> implements Queue<T>{
    private Node<T> first;
    private Node<T> last;
    private static int size;

    public LinkedQueue() {size = 0;}

    @Override
    public void addEllement(T element) {
        if (!isEmpty()){
            this.last.next = new Node<>(element, null);
            this.last = this.last.next;
        }else {
            this.last = null;
            this.first = new Node<>(element, this.last);
        }
        size++;
    }

    @Override
    public void clear() {
        Node<T> el = this.first.next;
        while (el != null){
            Node<T> next = el.next;
            el.element = null;
            el.next = null;
            el = next;
        }
        this.last = this.first = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T element() {
        return this.first.element;
    }

    @Override
    public T firstElement() {
        T el = this.first.element;
        this.first = this.first.next;
        size--;
        return el;
    }

    @Override
    public int size() {
        return size;
    }

    class Node<T> {
        T element;
        Node<T> next;

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }
}