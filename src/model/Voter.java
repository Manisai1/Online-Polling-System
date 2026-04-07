package model;

public class Voter {
    public int id;
    public String name;
    public boolean hasVoted;
    public Voter next;

    public Voter(int id, String name) {
        this.id = id;
        this.name = name;
        this.hasVoted = false;
        this.next = null;
    }
}