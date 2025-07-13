package com.tree_traverse.binary_tree.service;

import com.tree_traverse.binary_tree.model.Node;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeService {
    public static int orderOption = 2;
    public static List<Node> nodeList = new ArrayList<>();
    public static List<Node> nodes = new ArrayList<>();

    private static void printStack() {
        nodeList.forEach(System.out::println);
    }

    public static Node findParentRoot() {
        Node parentNode = null;
        for (Node nd : nodes) {
            if (nd.getParentId() == -1) {
                parentNode = nd;
                break;
            }
        }
        return parentNode;
    }

    public static void findChild(Node node) {
        if (node == null) {
            return;
        }
        if (node.getLeftId() != -1) {
            findChild(getNodeById(node.getLeftId()));
        }
        nodeList.add(node);
        if (node.getRightId() != -1) {
            findChild(getNodeById(node.getRightId()));
        }
    }

    private static void inorderTravers(Node node) {
        if (node.getLeftId() != -1) {
            findChild(getNodeById(node.getLeftId()));
        }
        nodeList.add(node);
        if (node.getRightId() != -1) {
            findChild(getNodeById(node.getRightId()));
        }
    }

    private static void preorderTravers(Node node) {
        nodeList.add(node);
        if (node.getLeftId() != -1) {
            findChild(getNodeById(node.getLeftId()));
        }
        if (node.getRightId() != -1) {
            findChild(getNodeById(node.getRightId()));
        }
    }

    private static void postorderTravers(Node node) {
        if (node.getLeftId() != -1) {
            findChild(getNodeById(node.getLeftId()));
        }
        if (node.getRightId() != -1) {
            findChild(getNodeById(node.getRightId()));
        }
        nodeList.add(node);
    }

    public static Node getNodeById(int id) {
        for (Node node : nodes) {
            if (node.getId() == id) {
                return node;
            }
        }
        return null;
    }

    public void runTrace() {
        nodes.add(new Node(1, "1", -1, 2, 3));
        nodes.add(new Node(2, "2", 1, -1, -1));
        nodes.add(new Node(3, "3", 1, 4, 5));
        nodes.add(new Node(4, "4", 3, 6, 7));
        nodes.add(new Node(5, "5", 3, -1, 8));
        nodes.add(new Node(6, "6", 4, -1, -1));
        nodes.add(new Node(7, "7", 4, 9, 10));
        nodes.add(new Node(8, "8", 5, -1, 11));
        nodes.add(new Node(9, "9", 7, -1, -1));
        nodes.add(new Node(10, "10", 7, 14, 15));
        nodes.add(new Node(11, "11", 10, 12, 13));
        nodes.add(new Node(12, "12", 11, -1, -1));
        nodes.add(new Node(13, "13", 11, 19, -1));
        nodes.add(new Node(14, "14", 10, -1, -1));
        nodes.add(new Node(15, "15", 10, -1, 16));
        nodes.add(new Node(16, "16", 15, 17, -1));
        nodes.add(new Node(17, "17", 16, 18, -1));
        nodes.add(new Node(18, "18", 17, -1, -1));
        nodes.add(new Node(19, "19", 13, -1, 20));
        nodes.add(new Node(20, "20", 19, -1, -1));

        Node parentNode = findParentRoot();

        switch (orderOption) {
            case 1:
                System.err.println("-- preorderTravers --");
                preorderTravers(parentNode);
                printStack();
                break;
            case 2:
                System.err.println("-- postorderTravers --");
                postorderTravers(parentNode);
                printStack();
                break;
            default:
                System.err.println("-- inorderTravers --");
                inorderTravers(parentNode);
                printStack();
                break;
        }
    }
}