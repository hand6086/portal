package com.hand.base.goods.model;

import java.util.ArrayList;
import java.util.List;

public class TopProductNav {

    private String id;

    private String name;

    private String parentId;

    private List<ProductNav> children = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<ProductNav> getChildren() {
        return children;
    }

    public void setChildren(List<ProductNav> children) {
        this.children = children;
    }
}
