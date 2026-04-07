package datastructures;

public class VoteQueue {

    int front = 0, rear = -1, size = 0;
    int capacity = 200;
    int[] queue = new int[capacity];

    public void enqueue(int id) {
        if (size == capacity) return;
        rear = (rear + 1) % capacity;
        queue[rear] = id;
        size++;
    }

    public int dequeue() {
        if (size == 0) return -1;
        int val = queue[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
}