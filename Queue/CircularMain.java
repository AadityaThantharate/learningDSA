package Queue;

public class CircularMain {
    
    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(6);
        System.err.println("size of queue " + circularQueue.size());
        circularQueue.display();
        circularQueue.enqueue(100);
        circularQueue.display();
        circularQueue.enqueue(50);
        circularQueue.display();
        circularQueue.enqueue(8000);
        System.out.println("dequeue : " + circularQueue.dequeue());
        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.display();
        System.out.println("size " + circularQueue.size());

    }
}
