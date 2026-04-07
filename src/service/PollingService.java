package service;

import datastructures.*;
import algorithms.*;
import model.*;

public class PollingService {

    public CandidateLinkedList candidates = new CandidateLinkedList();
    public VoterLinkedList voters = new VoterLinkedList();
    public VoteQueue queue = new VoteQueue();
    public VoteStack stack = new VoteStack();
    public CustomHashTable hash = new CustomHashTable();
    public CandidateBST bst = new CandidateBST();
    public MergeSort sorter = new MergeSort();

    public void castVote(int voterId, int candidateId) {

        Voter voter = voters.linearSearch(voterId);
        if (voter == null) {
            System.out.println("Voter not found.");
            return;
        }

        if (!hash.insert(voterId)) {
            System.out.println("Duplicate vote rejected.");
            return;
        }

        Candidate candidate = candidates.linearSearch(candidateId);
        if (candidate == null) {
            System.out.println("Candidate not found.");
            return;
        }

        candidate.votes++;
        voter.hasVoted = true;

        queue.enqueue(candidateId);
        stack.push(candidateId);

        System.out.println("Vote accepted.");
    }

    public void leaderboard() {
        Candidate[] arr = candidates.toArray();
        sorter.sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i].name + " - " + arr[i].votes);
    }

    public void undoVote() {
        int id = stack.pop();
        if (id == -1) {
            System.out.println("Nothing to undo.");
            return;
        }

        Candidate candidate = candidates.linearSearch(id);
        if (candidate != null && candidate.votes > 0)
            candidate.votes--;

        System.out.println("Undo successful.");
    }
}