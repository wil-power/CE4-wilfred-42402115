package ai.java;

public class Main {

    public static void main(String[] args) {

        Node root = new Node("S");
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        e.addNeighbour(b);
        b.addNeighbour(root, e);
        d.addNeighbour(a);
        c.addNeighbour(a);
        a.addNeighbour(root, c, d);
        root.addNeighbour(a, b);

        System.out.println(BreadthFirstSearch.breadthFirst(root));
    }
}
