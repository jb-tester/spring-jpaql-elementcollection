package com.example.springjpaqlelementcollection.idea317035;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.SortedSet;

@Entity
public class FirstParent {

    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection(targetClass = String.class)
    private SortedSet<String> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SortedSet<String> getChildren() {
        return children;
    }

    public void setChildren(SortedSet<String> children) {
        this.children = children;
    }
}