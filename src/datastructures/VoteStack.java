package datastructures;

public class VoteStack {

    int top = -1;
    int capacity = 200;
    int[] stack = new int[capacity];

    public void push(int id) {
        if (top < capacity - 1)
            stack[++top] = id;
    }

    public int pop() {
        if (top >= 0)
            return stack[top--];
        return -1;
    }

    public void displayLast5() {
        int count = 0;
        for (int i = top; i >= 0 && count < 5; i--) {
            System.out.println("Recent Vote Candidate ID: " + stack[i]);
            count++;
        }
    }
}