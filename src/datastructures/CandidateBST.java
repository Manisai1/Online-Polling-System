package datastructures;

public class CandidateBST {

    public static class Node {
        public int id;
        public String name;
        public Node left, right;

        public Node(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public Node root;

    public Node insert(Node root, int id, String name) {
        if (root == null)
            return new Node(id, name);

        if (id < root.id)
            root.left = insert(root.left, id, name);
        else
            root.right = insert(root.right, id, name);

        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.id + " - " + root.name);
            inorder(root.right);
        }
    }
}