package Queue;

import Queue.Main.queue;

public class simpleQueue {
    private int [] Queue;
    private int front;
    private int rear;
    private int capacity;

    public simpleQueue(int capacity){
        this.capacity = capacity;
        this.Queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    //insert data at rear:Enqueue
    public void Enqueue(int data){
        if(rear == capacity -1;){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        Queue[rear] =data;
        System.out.println(data +"data is inserted into elements");
    }
    public int dequeue(){
        if(front>rear){
            System.out.println("Queue is full");
            
        }
    }
}
