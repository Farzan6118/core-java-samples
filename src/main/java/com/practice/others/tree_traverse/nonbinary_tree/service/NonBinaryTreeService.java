package com.tree_traverse.nonbinary_tree.service;

import com.tree_traverse.nonbinary_tree.model.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonBinaryTreeService {
    private final Map<Integer, Node> treeList = new HashMap<>();

    public void runTrace() {
        treeList.put(1, new Node(1, "t1", null, List.of(2, 3, 4)));
        treeList.put(2, new Node(2, "t2", 1, List.of(12)));
        treeList.put(3, new Node(3, "t3", 1, List.of(5)));
        treeList.put(4, new Node(4, "t4", 1, List.of(6, 7, 8)));
        treeList.put(5, new Node(5, "t5", 3, List.of(9, 10, 11)));
        treeList.put(6, new Node(6, "t6", 4, List.of()));
        treeList.put(7, new Node(7, "t7", 4, List.of()));
        treeList.put(8, new Node(8, "t8", 4, List.of()));
        treeList.put(9, new Node(9, "t9", 5, List.of()));
        treeList.put(10, new Node(10, "t10", 5, List.of()));
        treeList.put(11, new Node(11, "t11", 5, List.of()));
        treeList.put(12, new Node(12, "t12", 2, List.of(13)));
        treeList.put(13, new Node(13, "t13", 12, List.of()));

        printNonBinaryTree(treeList.get(1));
    }

    private void printNonBinaryTree(Node node) {
        if (node.getChildIdList() == null || node.getChildIdList().isEmpty()) {
            System.out.println(node.getTreeName());
        } else {
            System.out.println(node.getTreeName());
            node.getChildIdList().forEach(id -> printTree(treeList.get(id)));
        }
    }

    private void printTree(Node node) {
        System.out.println(node.getTreeName());
        if (node.getChildIdList() != null || !node.getChildIdList().isEmpty()) {
            node.getChildIdList().forEach(id -> printTree(treeList.get(id)));
        }
    }
}