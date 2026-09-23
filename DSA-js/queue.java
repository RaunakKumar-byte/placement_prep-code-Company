class Queue {
    int[] items;
    int front;
    int rear;

    Queue() {
        items = new int[100];
        front = 0;
        rear = -1;
    }

    void enqueue(int element) {
        rear++;
        items[rear] = element;
    }

    int dequeue() {
        if (isEmpty()) {
            return -1;
        }

        return items[front++];
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }

        return items[front];
    }

    boolean isEmpty() {
        return front > rear;
    }

    int size() {
        return rear - front + 1;
    }
}

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(25);
        queue.enqueue(42);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}