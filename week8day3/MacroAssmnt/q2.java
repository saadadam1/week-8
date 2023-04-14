import java.util.LinkedList;

class Queue<Q> {
    private LinkedList<Q> items;

    public Queue() {
        this.items = new LinkedList<Q>();
    }

    public void enqueue(Q item) {
        this.items.add(item);
    }

    public Q dequeue() {
        if (!this.isEmpty()) {
            return this.items.removeFirst();
        }
        return null;
    }

    public Q peek() {
        if (!this.isEmpty()) {
            return this.items.getFirst();
        }
        return null;
    }

    public boolean isEmpty() {
        return this.items.size() == 0;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek()); // Output: 1

        queue.dequeue();

        System.out.println(queue.peek()); // Output: 2

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.isEmpty()); // Output: true
    }
}
