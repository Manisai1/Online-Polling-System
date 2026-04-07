package datastructures;

import model.Candidate;

public class CandidateLinkedList {

    public Candidate head;

    public void insert(int id, String name) {
        Candidate newNode = new Candidate(id, name);
        if (head == null) {
            head = newNode;
            return;
        }

        Candidate temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    public Candidate linearSearch(int id) {
        Candidate temp = head;
        while (temp != null) {
            if (temp.id == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public int size() {
        int count = 0;
        Candidate temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Candidate[] toArray() {
        int n = size();
        Candidate[] arr = new Candidate[n];
        Candidate temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp;
            temp = temp.next;
        }
        return arr;
    }
}