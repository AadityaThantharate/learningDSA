package Dequeue;

import Queue.interview;

public class Deque {
    private int[]arr;
    private int capacity; /// currenrt number of element

    private int front;
    private int rear;

    private int size;

    public Deque(int capacity) {
        this.capacity = capacity;
        arr = new  int [this.capacity];
        front =-1;
        rear=-1;
        size =0; 
    }
    public boolean isFull(){

    }
    public boolean isEmpty(){
        return size==0;
    }
    public void insertFront(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front =0;
            rear=0;
        }
        
        else if(front==0){
            front =capacity-1;
        }else{
            front--;
        }
        arr[front] = data;
        size++;
    }
    public void insertRear(int data){
        if(isFull()){
            System.out.println("Queue id full");
            return;
        }
        if(isEmpty()){
            front=0;
            rear=0;
        }
        else if(rear ==capacity){
            rear=0;
        }else{
            rear++;
        }
        arr[rear]=data;
        size++;
    }
    public int deleteFront(){
       if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
       }
        int data= arr[front];
        if (front== rear) {
            front=-1;
            rear=-1;
        }
        else if (front ==capacity-1) {
            front=0;
        }else{
            front++;
        }
        size--;
        return data;
    }
    public int deleteRear(){
        if (isEmpty()) {
            System.out.println("Queue is full");
            return -1;
        }
        int data = arr[rear];
        if(front==rear){
            front=-1;
            rear=-1;
        }else if(rear ==0){
            rear = capacity-1;
        }else{
            rear--;
        }
        size--; 
    }
    public int getRear(){
        if (isEmpty()) {
            System.out.println("Queue is full");
            return -1;
        }
        return arr[rear];
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Queue is full");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[(front+i)%capacity]+"\t");
        }
        System.out.println();
    }
}