package ai.java;

import java.util.LinkedList;
import java.util.Queue;

class BreadthFirstSearch {

    static private Queue<Node> nodeQueue = new LinkedList<Node>();
    static private Queue<Node> visitedNodes = new LinkedList<Node>();

    static String breadthFirst(Node pRootNode) {

        if (pRootNode == null)
            return "Empty node given";

        nodeQueue.add(pRootNode);

        StringBuilder stringBuilder = new StringBuilder();

        while (!nodeQueue.isEmpty()) {
            Node currentNode = nodeQueue.remove();

            if (currentNode != null) {

                if (!isVisited(currentNode))
                    stringBuilder.append(currentNode.toString()).append("\n");
                for (Node neighbor : currentNode.getNeighbourList()) {
                    if (!isVisited(neighbor))
                        nodeQueue.add(neighbor);
                }
                visitedNodes.add(currentNode);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isVisited(Node x) {
        boolean visited = false;
        for (Node visitedNode : visitedNodes) {
            if (visitedNode.getData().equals(x.getData())) {
                visited = true;
                break;
            }
        }

        return visited;
    }
}