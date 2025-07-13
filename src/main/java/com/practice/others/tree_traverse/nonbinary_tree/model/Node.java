package com.tree_traverse.nonbinary_tree.model;

import java.util.List;

public class Node {
    private Integer id;
    private String treeName;
    private Integer parentId;
    private List<Integer> ChildIdList;

    public Node(Integer id, String treeName, Integer parentId, List<Integer> ChildIdList) {
        this.id = id;
        this.treeName = treeName;
        this.parentId = parentId;
        this.ChildIdList = ChildIdList;
    }

    public Integer getId() {
        return id;
    }

    public Node setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTreeName() {
        return treeName;
    }

    public Node setTreeName(String treeName) {
        this.treeName = treeName;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Node setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public List<Integer> getChildIdList() {
        return ChildIdList;
    }

    public Node setChildIdList(List<Integer> childIdList) {
        this.ChildIdList = childIdList;
        return this;
    }
}