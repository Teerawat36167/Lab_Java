public class W6P3 {
    public static void main(String[] args) {
        Queue q1 = new Queue(20);
        for (int i = 1; i <= 20; i++) {
            q1.enqueue(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(q1.dequeue());
        }
    }
}
