package main;

import java.util.Scanner;
import service.PollingService;

public class PollingSystem {

    public static void main(String[] args) {

        PollingService service = new PollingService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Candidate\n2.Add Voter\n3.Cast Vote\n4.Leaderboard\n5.Recent Votes\n6.Undo\n7.Display Candidates(BST)\n8.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String cname = sc.nextLine();
                    service.candidates.insert(cid, cname);
                    service.bst.root = service.bst.insert(service.bst.root, cid, cname);
                    break;

                case 2:
                    System.out.print("ID: ");
                    int vid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String vname = sc.nextLine();
                    service.voters.insert(vid, vname);
                    break;

                case 3:
                    System.out.print("Voter ID: ");
                    int vId = sc.nextInt();
                    System.out.print("Candidate ID: ");
                    int cId = sc.nextInt();
                    service.castVote(vId, cId);
                    break;

                case 4:
                    service.leaderboard();
                    break;

                case 5:
                    service.stack.displayLast5();
                    break;

                case 6:
                    service.undoVote();
                    break;

                case 7:
                    service.bst.inorder(service.bst.root);
                    break;

                case 8:
                    System.out.println("Exit");
                    break;
            }

        } while (choice != 8);

        sc.close();
    }
}