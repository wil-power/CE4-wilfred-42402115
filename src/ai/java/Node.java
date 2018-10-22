package ai.java;

import java.util.ArrayList;
import java.util.Arrays;
/*
*
* this data class represents a node in the graph
*
*/
class Node {

    /** the name of the node **/
    private String mData;
    /** a list of this nodes adjacent nodes **/
    private ArrayList<Node> mNeighboursList = new ArrayList<>();

    /** constructor
     * @param pData the name of the node
     */
    Node(String pData) {
        mData = pData;
    }

    /** @return the name of the node */
    String getData() {
        return mData;
    }

    /** @return a list of all adjacent nodes*/
    ArrayList<Node> getNeighboursList() {
        return mNeighboursList;
    }

    /** @param pNodes an array of nodes to be added to this nodes adjacency nodes*/
    void addNeighbour(Node... pNodes) {
        mNeighboursList.addAll(Arrays.asList(pNodes));
    }

    @Override
    public String toString() {
        return "Node{" +
                "Name='" + mData + '\'' +
                '}';
    }
}
