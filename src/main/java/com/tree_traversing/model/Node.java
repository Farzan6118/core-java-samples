package com.tree_traversing.model;

public class Node {
    private Integer id;
    private String title;
    private Integer parentId;
    private Integer leftId;
    private Integer rightId;


    public Node() {
    }

    public Node(Integer id, String title, Integer parentId, Integer leftId, Integer rightId) {
        this.id = id;
        this.title = title;
        this.parentId = parentId;
        this.leftId = leftId;
        this.rightId = rightId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLeftId() {
        return leftId;
    }

    public void setLeftId(Integer leftId) {
        this.leftId = leftId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", parentId=").append(parentId);
        sb.append(", leftId=").append(leftId);
        sb.append(", rightId=").append(rightId);
        sb.append('}');
        return sb.toString();
    }
}