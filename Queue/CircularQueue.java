package Queue;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity){
        queue = new int [capacity];
        front=0;
        rear =-1;
        size =0;
        this.capacity = capacity;

    }
    public void  enqueue(int data){
        if(size == capacity){
            System.out.println("QUEUE IS FULL");
            return;
        }
        // capacity =10
        //rear
        rear = rear +1 % capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue(){
        if(size ==0){
            System.out.println("Queue is empty !..");
            return -1;
        }
        int data = queue[front];
        front = (front+1)%capacity;
        size--;
        return data;
    }

    public int size(){
        return this.size;
    }
    
    public void display(){
        if(this.size ==0){
            System.out.println("queue is empty");
            return;
        }
        // for(int i=0;i<= rear;i++){
        //     System.out.print(queue[i]+"\t");
        // }
        for(int i=0;i<size;i++){
            int data = queue [(front + i)% capacity];
            System.out.print(data+"\t");
        }
        System.out.println();
    }
}
