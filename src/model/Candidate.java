package model;

public class Candidate {
    public int id;
    public String name;
    public int votes;
    public Candidate next;

    public Candidate(int id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
        this.next = null;
    }
}
