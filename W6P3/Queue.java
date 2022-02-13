public class Queue {
    private int[] elements;
    private int size = 0;

    public Queue() {
        this.elements = new int[8];
    }

    public Queue(int size) {
        this.elements = new int[size];
    }

    public void enqueue(int v) {
        if (size == elements.length-1) {
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int first = elements[0];
        System.arraycopy(elements, 1, elements, 0, size-1);
        size--;
        return first;
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getSize() {
        return this.size;
    }
}