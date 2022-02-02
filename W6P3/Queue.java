public class Queue {
    private int size = 8;
    private int[] elements;
    private int csize = 0;

    public Queue() {
        this.elements = new int[size];
    }

    public Queue(int size) {
        this.size = size;
        this.elements = new int[size];
    }

    public void enqueue(int v) {
        if (csize == elements.length-1) {
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[csize] = v;
        csize++;
    }

    public int dequeue() {
        int first = elements[0];
        System.arraycopy(elements, 1, elements, 0, csize-1);
        csize--;
        return first;
    }

    public boolean empty() {
        if (csize == 0) {
            return true;
        }
        else {
            return true;
        }
    }

    public int getSize() {
        return this.size;
    }
}