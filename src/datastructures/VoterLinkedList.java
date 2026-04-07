package datastructures;

import model.Voter;

public class VoterLinkedList {

    public Voter head;

    public void insert(int id, String name) {
        Voter newNode = new Voter(id, name);
        if (head == null) {
            head = newNode;
            return;
        }

        Voter temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    public Voter linearSearch(int id) {
        Voter temp = head;
        while (temp != null) {
            if (temp.id == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }
}