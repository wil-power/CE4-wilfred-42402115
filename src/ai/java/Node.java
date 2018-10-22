package ai.java;

import java.util.ArrayList;
import java.util.Arrays;

class Node {
    private String mData = "Node";
    private ArrayList<Node> mNeighbourList = new ArrayList<>();

    public Node(String pData, ArrayList<Node> pNeighbourList) {
        mData = pData;
        mNeighbourList = pNeighbourList;
    }

    public Node() {
    }

    public Node(String pData) {
        mData = pData;
    }

    public String getData() {
        return mData;
    }

    public void setData(String pData) {
        mData = pData;
    }

    public ArrayList<Node> getNeighbourList() {
        return mNeighbourList;
    }

    public void setNeighbourList(ArrayList<Node> pNeighbourList) {
        mNeighbourList = pNeighbourList;
    }

    public void addNeighbour(Node... pNodes) {
        mNeighbourList.addAll(Arrays.asList(pNodes));
    }

    @Override
    public String toString() {
        return "Node{" +
                "Name='" + mData + '\'' +
                '}';
    }
}
