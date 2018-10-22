package ai.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * this class contains necessary ops for BFS
 */
class BreadthFirstSearch {

    // a queue of nodes found in the graph to be traversed
    static private Queue<Node> nodeQueue = new LinkedList<Node>();
    // a list of already visited node, to make sure we don't visit any node more than once
    static private ArrayList<Node> visitedNodes = new ArrayList<>();

    /**
     * the algorithm function
     *
     * @param pRootNode the node to begin the traversal from
     *                  it must have references to other nodes in the graph.
     */
    static String breadthFirst(Node pRootNode) {

        if (pRootNode == null)
            return "Empty node given";

        // enqueue the root node
        nodeQueue.add(pRootNode);

        StringBuilder stringBuilder = new StringBuilder();

        // continue looping while the queue is not empty.
        while (!nodeQueue.isEmpty()) {
            // get and remove the node at the bottom of the queue
            Node currentNode = nodeQueue.remove();

            if (!isVisited(currentNode)) {
                // if the current node is not already visited, add its info to the stringBuilder
                stringBuilder.append(currentNode.toString()).append("\n");

                // also loop through the list of the current nodes neighbour nodes
                for (Node neighbor : currentNode.getNeighboursList()) {

                    // add the neighbours to the nodeQueue if they're not already visited
                    if (!isVisited(neighbor))
                        nodeQueue.add(neighbor);
                }
            }
            // add the current node to the visited nodes
            visitedNodes.add(currentNode);
        }

        // return the stringBuilder's value,
        // which is a representation of how the graph was traversed
        return stringBuilder.toString();
    }

    /**
    * check whether a node is already visited.
     * @param x the node to be checked
     * */
    private static boolean isVisited(Node x) {
        boolean visited = false;
        // loop through the visitedNodes list
        for (Node visitedNode : visitedNodes) {
            // check if a visited node has the same
            // name as the node to be checked
            if (visitedNode.getData().equals(x.getData())) {
                visited = true;
                break;
            }
        }

        return visited;
    }
}